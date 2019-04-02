package com.zjgk.controller;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliyuncs.exceptions.ClientException;
import com.zjgk.DO.AjaxJson;
import com.zjgk.DO.UserInfoDO;
import com.zjgk.DO.enumDO.Subjects;
import com.zjgk.entity.Sign;
import com.zjgk.entity.User;
import com.zjgk.entity.UserScore;
import com.zjgk.servelt.SendSmsUtil;
import com.zjgk.service.UserScoreService;
import com.zjgk.service.UserService;
import com.zjgk.util.StringUtil;
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserScoreService userScoreService;
	
	
	//private String u1;
	
	
	@ResponseBody
	@RequestMapping("/findUserByNamel/{userName}")
	public String findUserByName(HttpServletRequest request, HttpServletResponse response, @PathVariable String userName) {
		 
		User u = userService.findUserByName(userName);
		if(u==null || u.getUserName()==null || u.getUserName().equals("")){
			return "1";
		}else{
			return "0";
		}
		
	}
	
	@ResponseBody
	@RequestMapping("/findUserByPhone/{userPhone}")//忘记密码界面验证用户是否存在（点击修改密码时验证用户信息）
	public String findUserByPhone(HttpServletRequest request, HttpServletResponse response, @PathVariable String userPhone) {
		 
		User u = userService.findUserByPhone(userPhone);
		if(u==null || u.getCellphone()==null || u.getCellphone().equals("")){
			return "1";
		}else{
			return "0";
		}
		
	}
	
	@ResponseBody
	@RequestMapping("/find/{phone}")//注册界面短信获取与验证
	public String find(HttpServletRequest request, HttpServletResponse response, @PathVariable String phone) {
		
		
		String phone1=userService.find(phone);//将前台传来的用户手机号赋值给phone1
		String phone2 = null;
		try {
			phone2 = SendSmsUtil.validphone(phone1);
			System.out.println("获取验证码"+phone2);
	        HttpSession session = request.getSession();
	        session.setAttribute("yzm", phone2);

			//u1=phone2;
			if(phone2.equals("error")) {
				return "0";
				
			}
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(phone2!=null) {
			return "1";
			}
		else {
			return "0";
		}
			
		
	}
	
	
	
	@ResponseBody
	@RequestMapping("/forgot")
	public AjaxJson forgot(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		String u1=null;
		String	forgot_phone =request.getParameter("forgot_phone");
		String	forgot_phonecode =request.getParameter("forgot_phonecode");
		String	forgot_password =request.getParameter("forgot_password");
		HttpSession session = request.getSession();
		u1=(String)session.getAttribute("yzm");
		//1.判断验证码是否相同
		if(!u1.equals(forgot_phonecode)){
			ajaxJson.setSuccess(0);
			ajaxJson.setMsg("验证码不正确！");
		}else {
			//2修改密码
			String res=  userService.forgetPassword(forgot_phone,forgot_password);
			if(res=="1") {
				ajaxJson.setSuccess(1);
				ajaxJson.setMsg("密码重置成功！");
			}
			else {
				ajaxJson.setSuccess(0);
				ajaxJson.setMsg("密码重置失败！");
				
			}
		}
		return ajaxJson;
		//String rs=update_pwd.huoqu(forgot_password,forgot_phone);//修改
//				
//		if(rs.equals("success"))	{//更换重置后的密码update数据库密码（未shi'xian）
//		
//		return ajaxJson;
//			}
//		else {
//			ajaxJson.setSuccess(0);
//			ajaxJson.setMsg("密码重置失败！");
//			return ajaxJson;	
//		}
		
	}
	

	@ResponseBody
	@RequestMapping("/sign")
	public AjaxJson sign(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		String school = request.getParameter("school");
		String grade = request.getParameter("grade");
		String student1 = request.getParameter("student1");
		String student2 = request.getParameter("student2");
		String student3 = request.getParameter("student3");
		String teacher = request.getParameter("teacher");
		String test=null;
		
		Sign sign =  new Sign();
		sign.setGrade(grade);
		sign.setSchool(school);
		sign.setStudent1(student1);
		sign.setStudent2(student2);
		sign.setStudent3(student3);
		sign.setTeacher(teacher);
		
		test=userService.addSign(sign);
		if(test=="1") {
		ajaxJson.setSuccess(1);
		ajaxJson.setMsg("报名成功！");
		
		}
		else {
			ajaxJson.setMsg("报名失败！");
		}
		return ajaxJson;
	
	}
	@ResponseBody
	@RequestMapping("/register")
	public AjaxJson register(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		String u1=null;
		String agreeRules = request.getParameter("agreeRules");
		String cellphone = request.getParameter("cellphone");
		String chinese = request.getParameter("chinese");
		String confirmPassword = request.getParameter("confirmPassword");
		String district = request.getParameter("district");
		String userName = request.getParameter("userName");
		String english = request.getParameter("english");
		String math = request.getParameter("math");
		String passNo = request.getParameter("passNo");
		String password = request.getParameter("password");
		String score1 = request.getParameter("score1");
		String score2 = request.getParameter("score2");
		String score3 = request.getParameter("score3");
		String subject1 = request.getParameter("subject1");
		String subject2 = request.getParameter("subject2");
		String subject3 = request.getParameter("subject3");
		String validateCode = request.getParameter("validateCode");
		String rank =  request.getParameter("rank");
		String cellphoneCode =  request.getParameter("cellphoneCode");
		String authCode = request.getSession().getAttribute("authCode").toString().toUpperCase();
        HttpSession session = request.getSession();
		u1=(String)session.getAttribute("yzm");
		if(!u1.equals(cellphoneCode)){
			ajaxJson.setSuccess(0);
			ajaxJson.setMsg("短信验证码不正确！");
			u1=null;
			return ajaxJson;
		}
		if(!authCode.equals(validateCode.toUpperCase())){
			ajaxJson.setSuccess(0);
			ajaxJson.setMsg("图片验证码不正确！");
			return ajaxJson;
		}
		
		User uDb = userService.findUserByName(userName);
		if(uDb!=null ){
			ajaxJson.setSuccess(0);
			ajaxJson.setMsg("用户名已存在，请用其他用户名注册！");
			return ajaxJson;
		}
		
		//user
		User u =  new User();
		u.setCellphone(cellphone);
		u.setDistrict(Long.parseLong(district));
		u.setLevel("0");
		u.setPassNo(passNo);
		u.setPassword(StringUtil.getMD5Str(password));
		u.setRegDate(new Date());
		u.setUserName(userName);
		u.setRank(Integer.parseInt(rank));
		
		//score list
		List<UserScore> userScoreList = new ArrayList<UserScore>();
		
		UserScore chineseScore = new UserScore();
		chineseScore.setScore(chinese);
		chineseScore.setSubject(Subjects.语文);
		userScoreList.add(chineseScore);
		 
		UserScore mathScore = new UserScore();
		mathScore.setScore(math);
		mathScore.setSubject(Subjects.数学);
		userScoreList.add(mathScore);
		 
		UserScore englishScore = new UserScore();
		englishScore.setScore(english);
		englishScore.setSubject(Subjects.英语);
		userScoreList.add(englishScore);
		
		UserScore score1Score = new UserScore();
		score1Score.setScore(score1);
		score1Score.setSubject(Subjects.getSubject(Integer.parseInt(subject1)));
		userScoreList.add(score1Score);
		
		UserScore score2Score = new UserScore();
		score2Score.setScore(score2);
		score2Score.setSubject(Subjects.getSubject(Integer.parseInt(subject2)));
		userScoreList.add(score2Score);
		
		UserScore score3Score = new UserScore();
		score3Score.setScore(score3);
		score3Score.setSubject(Subjects.getSubject(Integer.parseInt(subject3)));
		userScoreList.add(score3Score);

		userService.addUser(u, userScoreList);
		
		ajaxJson.setSuccess(1);
		ajaxJson.setMsg("注册成功！");
		u1=null;
		return ajaxJson;
	}
	
	@ResponseBody
	@RequestMapping("/info")
	public AjaxJson info(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson ajaxJson = new AjaxJson();
		UserInfoDO   userInfoDO = new UserInfoDO();
		
		User u =   (User) request.getSession().getAttribute("user");
		List<UserScore>userScorelist = userScoreService.getUserScoreList(u);
		int totalScore = 0;
		for(UserScore s: userScorelist){
			totalScore = totalScore + Integer.parseInt(s.getScore());
		}
		
		userInfoDO.setUserName(u.getUserName());
		userInfoDO.setTotalScore(totalScore);
		userInfoDO.setRank(u.getRank());
		ajaxJson.setData(userInfoDO);
		ajaxJson.setSuccess(1);
		
		return ajaxJson;
	}

	
	
	
}
