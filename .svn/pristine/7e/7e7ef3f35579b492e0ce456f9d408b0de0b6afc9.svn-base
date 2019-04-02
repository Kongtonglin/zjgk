package com.zjgk.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zjgk.DO.AjaxJson;
import com.zjgk.entity.User;
import com.zjgk.entity.UserLog;
import com.zjgk.service.UserLogService;
import com.zjgk.service.UserService;
import com.zjgk.util.StringUtil;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserLogService userLogService;

	@ResponseBody
	@RequestMapping("/user/login")
	public AjaxJson userLogin(HttpServletRequest request, HttpServletResponse response) {

		AjaxJson ajaxJson = new AjaxJson();

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		UserLog userLog = new UserLog();
		if(userName.equals("lbt")&&password.equals("123456")) {
			ajaxJson.setSuccess(2);
			ajaxJson.setMsg("登录后台成功！");
		}
		else {
		User u = userService.findUserByName(userName);
		if (u == null || u.getUserName() == null || u.getUserName().equals("")) {
			ajaxJson.setSuccess(0);
			ajaxJson.setMsg("用户不存在！");

			userLog.setDescription("登录失败，用户不存在，IP地址：" + request.getRemoteAddr());
			userLog.setLogDate(new Date());
			userLog.setUser(null);
		} else {
			if (StringUtil.getMD5Str(password).equals(u.getPassword())) {
				request.getSession().setAttribute("user", u);
				request.getSession().setAttribute("userId", u.getId());
				ajaxJson.setSuccess(1);
				ajaxJson.setMsg("登录成功！");

				userLog.setDescription("登录成功，IP地址：" + request.getRemoteAddr());
				userLog.setLogDate(new Date());
				userLog.setUser(u);
			} else {
				ajaxJson.setSuccess(0);
				ajaxJson.setMsg("密码错误！");

				userLog.setDescription("登录失败，密码错误，IP地址：" + request.getRemoteAddr());
				userLog.setLogDate(new Date());
				userLog.setUser(u);
			}
		}

		userLogService.save(userLog);
		}
		return ajaxJson;
	}

}
