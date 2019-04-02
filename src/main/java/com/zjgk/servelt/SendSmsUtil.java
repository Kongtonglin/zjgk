package com.zjgk.servelt;

import java.util.Random;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.sun.istack.internal.logging.Logger;


public class SendSmsUtil {
    /**
     * 生成验证码
     * @return
     */
    public static String getCaptcha() {
        String str = "0,1,2,3,4,5,6,7,8,9";
        String str2[] = str.split(",");// 将字符串以,分割
        Random rand = new Random();// 创建Random类的对象rand
        int index = 0;
        String randStr = "";// 创建内容为空字符串对象randStr
        randStr = "";// 清空字符串对象randStr中的值
        for (int i = 0; i < 6; ++i) {
            index = rand.nextInt(str2.length - 1);// 在0到str2.length-1生成一个伪随机数赋值给index
            randStr += str2[index];// 将对应索引的数组与randStr的变量值相连接
        }
        return randStr;
    }

    public static  String validphone(String phonenum) throws ClientException {
        String code = getCaptcha();
        System.out.println("验证码为：" + code);
        String templateCode = "SMS_128560170";
        String recNum = phonenum;
        
        //设置超时时间-可自行调整
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        //初始化ascClient需要的几个参数
        final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
        final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
        //替换成你的AK
        final String accessKeyId = "LTAIjwDqDJqUs5iJ";//你的accessKeyId,参考本文档步骤2
        final String accessKeySecret = "n4R7Z9Y5WFOeUmuTWpEpsSANrYXvq9";//你的accessKeySecret，参考本文档步骤2
        //初始化ascClient,暂时不支持多region（请勿修改）
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
        accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);
         //组装请求对象
         SendSmsRequest request = new SendSmsRequest();
         //使用post提交
         request.setMethod(MethodType.POST);
         //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式
         request.setPhoneNumbers(recNum);
         //必填:短信签名-可在短信控制台中找到
         request.setSignName("刘半藤");
         //必填:短信模板-可在短信控制台中找到
         request.setTemplateCode(templateCode);
         //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
         //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
         request.setTemplateParam("{\"name\":\"Tom\", \"code\":\""+code+"\"}");
         //可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
         //request.setSmsUpExtendCode("90997");
         //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
//         request.setOutId("yourOutId");
        //请求失败这里会抛ClientException异常
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
        System.out.println(sendSmsResponse.getCode());
        if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
        	System.out.println("请求成功");
        	System.out.println("返回code"+code);
        	return code;
        }else {
        	System.out.println("请求失败");
        	return "error";
        }
        
    }
}
