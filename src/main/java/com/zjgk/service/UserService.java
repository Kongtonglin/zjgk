package com.zjgk.service;

import java.util.List;

import com.zjgk.DO.AjaxJson;
import com.zjgk.entity.Sign;
import com.zjgk.entity.User;
import com.zjgk.entity.UserScore;
import com.zjgk.entity.UserResult;

public interface UserService {
 
	public String  addUser(User u, List<UserScore> userScoreList) ;
	
	public User findUserByName(String userName);
	
	public User findUserByPhone(String userPhone);
	
	public User findUserById(int id);
	
	public void updatePassword(String userName,String oldPassWord, String newPassword);
	
	public void updateUser(User User);
	
	public String find(String phone);
	
	public String  forgetPassword(String Phone, String password);

	public String addSign(Sign sign);

	public String addUserRsult(User u, UserResult List);


}
