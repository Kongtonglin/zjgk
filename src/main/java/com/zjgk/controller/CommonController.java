package com.zjgk.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zjgk.DO.AjaxJson;
import com.zjgk.DO.BackstageDO;
import com.zjgk.DO.CommonOptional;
import com.zjgk.DO.CommonOptionalResult;
import com.zjgk.DO.CommonQueryDO;
import com.zjgk.DO.CommonQueryResultDO;
import com.zjgk.entity.User;
import com.zjgk.entity.UserResult;
import com.zjgk.service.BackstageService;
import com.zjgk.service.CommonQueryService;
import com.zjgk.service.CommonQueryService2017;
import com.zjgk.service.OptionalService;
import com.zjgk.service.UserService;
import com.zjgk.service.impl.OptionalImpl;
import com.zjgk.util.CachFactory;


@Controller
@RequestMapping("/common")
public class CommonController {
	
	@Autowired
	private CommonQueryService commonQueryService;
	
	@Autowired
	private OptionalService optionalService;
	
	@Autowired
	private BackstageService backstageService;
	
	@Autowired
	private CommonQueryService2017 commonQueryService2017;
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/majorId")
	public AjaxJson majorId(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		 
		ajaxJson.setData( optionalService.getMajorIdList());
		
		ajaxJson.setSuccess(1);
		ajaxJson.setMsg("获取成功");
		return ajaxJson;
	}
	
	@ResponseBody
	@RequestMapping("/subjectId")
	public AjaxJson subjectId(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		 
		ajaxJson.setData( optionalService.getSubjectIdList());
		
		ajaxJson.setSuccess(1);
		ajaxJson.setMsg("获取成功");
		return ajaxJson;
	}
	
	@ResponseBody
	@RequestMapping("/schoolId")
	public AjaxJson schoolId(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		 
		ajaxJson.setData( optionalService.getSchoolIdList());
		
		ajaxJson.setSuccess(1);
		ajaxJson.setMsg("获取成功");
		return ajaxJson;
	}
	
 
	@ResponseBody
	@RequestMapping("/province")
	public AjaxJson province(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		 
		ajaxJson.setData( commonQueryService.getProvinceList());
		ajaxJson.setSuccess(1);
		ajaxJson.setMsg("获取成功");
		
		return ajaxJson;
	}
	
	@ResponseBody
	@RequestMapping("/major/level/one")
	public AjaxJson majorLevelOne(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
	 
		ajaxJson.setData( commonQueryService.getMajorClassifyLevelOneList());
		ajaxJson.setSuccess(1);
		
		return ajaxJson;
	}
	
	@ResponseBody
	@RequestMapping("/major/level/two/{levelOne}")
	public AjaxJson majorLevelTwo(HttpServletRequest request, HttpServletResponse response, @PathVariable String levelOne) {
		AjaxJson ajaxJson = new AjaxJson();
	if(levelOne.length()>2) {
		ajaxJson.setData(commonQueryService.getMajorClassifyLevelTwoList(levelOne));
		ajaxJson.setSuccess(2);
	}
	else {
		ajaxJson.setData(commonQueryService.getMajorClassifyLevelTwoList(levelOne));
		ajaxJson.setSuccess(1);
	}
		return ajaxJson;
	}
	
	//排名
	@ResponseBody
	@RequestMapping("/order")
	public AjaxJson order(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		ajaxJson.setData( commonQueryService.getMajorClassifyLevelOneList());
		ajaxJson.setSuccess(1);
		return ajaxJson;
	}
	
	@ResponseBody
	@RequestMapping("/optionaldation")
	public AjaxJson optionaldation(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();

		CommonOptional commonOptional = new CommonOptional();
		String major = request.getParameter("major");
		String subject = request.getParameter("subject");
		String school = request.getParameter("school");
		commonOptional.setMajor(major);
		commonOptional.setSchool(school);
		commonOptional.setSubject(subject);
		List<CommonOptionalResult> list =  null;
		list = optionalService.OptionalCommon( commonOptional);
		ajaxJson.setData(list);
		
		ajaxJson.setSuccess(1);
		return ajaxJson;
	}
	
	@ResponseBody
	@RequestMapping("/backstage")
	public AjaxJson backstage(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		List<BackstageDO> list =  null;
		list = backstageService.BackstageCommon();
		ajaxJson.setData(list);
		ajaxJson.setSuccess(1);
		return ajaxJson;
	}
	
	@ResponseBody
	@RequestMapping("/recommendation/{province}")
	public AjaxJson recommendation(HttpServletRequest request, HttpServletResponse response, @PathVariable String province) {
		AjaxJson ajaxJson = new AjaxJson();
		CommonQueryDO commonQueryDO = new CommonQueryDO();
		List<CommonQueryResultDO> listFinal = new ArrayList<CommonQueryResultDO>();//定义结果list
		User u =   (User) request.getSession().getAttribute("user");
		String levelOne = request.getParameter("majorLevelOne");
		String levelOne2 = request.getParameter("majorLevelOne2");
		String levelOne3 = request.getParameter("majorLevelOne3");
		String majorLevelTwo = request.getParameter("majorLevelTwo");
		String majorLevelTwo2 = request.getParameter("majorLevelTwo2");
		String majorLevelTwo3 = request.getParameter("majorLevelTwo3");
		String order = request.getParameter("order");
		String probability1 = request.getParameter("probability1");
		String probability2 = request.getParameter("probability2");
		String probability3 = request.getParameter("probability3");
		String pro[] = null;
		String lev[] = new String [3];
		String levT[]=new String [3];
		String result[] = new String [80];
		String school=null;
		String major=null;
		int length;
		pro = province.split(",");
		//lev = levelOne.split(",");
		lev[0]=levelOne;
		lev[1]=levelOne2;
		lev[2]=levelOne3;
		levT[0]=majorLevelTwo;
		levT[1]=majorLevelTwo2;
		levT[2]=majorLevelTwo3;
		//commonQueryDO.setMajorLevelOne(majorLevelOne);
		//commonQueryDO.setMajorLevelTwo(majorLevelTwo);
		commonQueryDO.setOrder(order);
		commonQueryDO.setProbability1(probability1);
		commonQueryDO.setProbability2(probability2);
		commonQueryDO.setProbability3(probability3);
		//commonQueryDO.setProvince(Province);
		List<CommonQueryResultDO> list =  null;
		/*for (int i = 0; i < time1+1; i++) {//循环遍历
			 prov=pro[i];
			 if(prov.length()<2) {
			 prov=prov.substring(0,1);
			 }
			 else {
				 prov=prov.substring(0,2);
			 }
			 commonQueryDO.setProvince(prov);
			 for (int j = 0; j < time2+1; j++) {
				 leve=lev[j];
				 leve=leve.substring(0,2);
				 commonQueryDO.setMajorLevelOne(leve);
				 list = commonQueryService2017.recommondationCommon(u,commonQueryDO);
				 listFinal.add(list);
			 }
			}
			list=listFinal;*/
		
		
		//list=selectChoose.select(commonQueryDO, Province, majorLevelOne, u);
		/*if(majorLevelOne.equals("8888")){ //大类
			 list = commonQueryService.recommondationDl(u, commonQueryDO);
		}else if(majorLevelOne.equals("9999")){//实验班
			list = commonQueryService.recommondationSyb(u, commonQueryDO);
		}else{//普通推荐
		*/
		//list = commonQueryService.recommondationCommon(u, commonQueryDO);
		list = commonQueryService2017.recommondationCommon(u, commonQueryDO,pro,lev,levT);
		 
		//按武书连排名排序
		if(list!=null && list.size()>0){
			//获得排名的map
			Map<String, Object> schoolRankMap = null; 
			if(order.equals("9999")){//综合
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankZhMap");
			}
			else if(order.equals("01")){//哲学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankZxMap");
			}else if(order.equals("02")){//经济学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankJjxMap");
			}else if(order.equals("03")){//法学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankFxMap");
			}else if(order.equals("04")){//教育学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankJyxMap");
			}else if(order.equals("05")){//文学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankWxMap");
			}else if(order.equals("06")){//历史学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankLsxMap");
			}else if(order.equals("07")){//理学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankLxMap");
			}else if(order.equals("08")){//工学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankGxMap");
			}else if(order.equals("09")){//农学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankNxMap");
			}else if(order.equals("10")){//医学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankYxMap");
			}else if(order.equals("12")){//管理学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankGlxMap");
			}else if(order.equals("13")){//艺术学
				schoolRankMap = CachFactory.getInstance().getMapByKey("schoolRankYsxMap");
			}
			
			//循环设置rank属性
			 for(CommonQueryResultDO _do: list){
				 if(schoolRankMap.containsKey(_do.getSchool())){
					 _do.setRank((int)schoolRankMap.get(_do.getSchool()));
				 }else{
					 _do.setRank(99999);
				 }
			 }
		//排序
	   Comparator<CommonQueryResultDO> comparator = new Comparator<CommonQueryResultDO>() {  
            public int compare(CommonQueryResultDO c1, CommonQueryResultDO c2) {
                if((c1.getRank()-c2.getRank())<0)   
                    return -1;  
                else if((c1.getRank()-c2.getRank())>0)  
                    return 1;  
                else return 0;  
            }  
         };  
		System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
		Collections.sort(list,comparator);
		}
		
		if(list.size()<80) {
			length=list.size();
		}
		else {
			length=80;
		}
		list= list.subList(0,length);
		ajaxJson.setData(list);//调整位置
		//ajaxJson.setData();
		ajaxJson.setSuccess(1);
		UserResult userresult = new UserResult();
		for(int i=0;i<length;i++) {
			school=list.get(i).getSchool();
			major=list.get(i).getMajorDetail();
			result[i]=major+"-"+school+";";
		}
		userresult.setChangeDate(new Date());
		userresult.setResult01(result[0]);
		userresult.setResult02(result[1]);
		userresult.setResult03(result[2]);
		userresult.setResult04(result[3]);
		userresult.setResult05(result[4]);
		userresult.setResult06(result[5]);
		userresult.setResult07(result[6]);
		userresult.setResult08(result[7]);
		userresult.setResult09(result[8]);
		userresult.setResult10(result[9]);
		userresult.setResult11(result[10]);
		userresult.setResult12(result[11]);
		userresult.setResult13(result[12]);
		userresult.setResult14(result[13]);
		userresult.setResult15(result[14]);
		userresult.setResult16(result[15]);
		userresult.setResult17(result[16]);
		userresult.setResult18(result[17]);
		userresult.setResult19(result[18]);
		userresult.setResult20(result[19]);
		userresult.setResult21(result[20]);
		userresult.setResult22(result[21]);
		userresult.setResult23(result[22]);
		userresult.setResult24(result[23]);
		userresult.setResult25(result[24]);
		userresult.setResult26(result[25]);
		userresult.setResult27(result[26]);
		userresult.setResult28(result[27]);
		userresult.setResult29(result[28]);
		userresult.setResult30(result[29]);
		userresult.setResult31(result[30]);
		userresult.setResult32(result[31]);
		userresult.setResult33(result[32]);
		userresult.setResult34(result[33]);
		userresult.setResult35(result[34]);
		userresult.setResult36(result[35]);
		userresult.setResult37(result[36]);
		userresult.setResult38(result[37]);
		userresult.setResult39(result[38]);
		userresult.setResult40(result[39]);
		userresult.setResult41(result[40]);
		userresult.setResult42(result[41]);
		userresult.setResult43(result[42]);
		userresult.setResult44(result[43]);
		userresult.setResult45(result[44]);
		userresult.setResult46(result[45]);
		userresult.setResult47(result[46]);
		userresult.setResult48(result[47]);
		userresult.setResult49(result[48]);
		userresult.setResult50(result[49]);
		userService.addUserRsult(u, userresult);
		return ajaxJson;
	}
}
