package com.zjgk.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zjgk.DAO.BaseDAO;
import com.zjgk.DO.AjaxJson;
import com.zjgk.entity.Sign;
import com.zjgk.entity.User;
import com.zjgk.entity.UserResult;
import com.zjgk.entity.UserScore;
import com.zjgk.service.UserService;
import com.zjgk.util.StringUtil;

@Service("userScoreService")
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Resource
	private BaseDAO<User> userDAO;
	
	@Resource
	private BaseDAO<Sign> signDAO;
	
	@Resource
	private BaseDAO<UserScore> userScoreDAO;
	
	@Resource
	private BaseDAO<UserResult> userResultDAO;


	@Override
	public String addUser(User u, List<UserScore> userScoreList) {
		
		Serializable s  = userDAO.save(u);
		if(s==null){
			return "0";
		} 
		u.setId(Long.parseLong(s.toString()));
		for(UserScore score: userScoreList){
			score.setUser(u);
			userScoreDAO.save(score);
		} 
		
		return "1";
	}
	
	@Override
	public String addUserRsult(User u, UserResult result) {
		Long User_id;
		User_id=u.getId();
		List<UserResult> list =userResultDAO.find("from UserResult where user_id='"+User_id+"'");
		if(list.size()>0){//更新数据
			UserResult resultupdate=list.get(0);
			resultupdate.setChangeDate(result.getChangeDate());
			resultupdate.setResult01(result.getResult01());
			resultupdate.setResult02(result.getResult02());
			resultupdate.setResult03(result.getResult03());
			resultupdate.setResult04(result.getResult04());
			resultupdate.setResult05(result.getResult05());
			resultupdate.setResult06(result.getResult06());
			resultupdate.setResult07(result.getResult07());
			resultupdate.setResult08(result.getResult08());
			resultupdate.setResult09(result.getResult09());
			resultupdate.setResult10(result.getResult10());
			resultupdate.setResult11(result.getResult11());
			resultupdate.setResult12(result.getResult12());
			resultupdate.setResult13(result.getResult13());
			resultupdate.setResult14(result.getResult14());
			resultupdate.setResult15(result.getResult15());
			resultupdate.setResult16(result.getResult16());
			resultupdate.setResult17(result.getResult17());
			resultupdate.setResult18(result.getResult18());
			resultupdate.setResult19(result.getResult19());
			resultupdate.setResult20(result.getResult20());
			resultupdate.setResult21(result.getResult21());
			resultupdate.setResult22(result.getResult22());
			resultupdate.setResult23(result.getResult23());
			resultupdate.setResult24(result.getResult24());
			resultupdate.setResult25(result.getResult25());
			resultupdate.setResult26(result.getResult26());
			resultupdate.setResult27(result.getResult27());
			resultupdate.setResult28(result.getResult28());
			resultupdate.setResult29(result.getResult29());
			resultupdate.setResult30(result.getResult30());
			resultupdate.setResult31(result.getResult31());
			resultupdate.setResult32(result.getResult32());
			resultupdate.setResult33(result.getResult33());
			resultupdate.setResult34(result.getResult34());
			resultupdate.setResult35(result.getResult35());
			resultupdate.setResult36(result.getResult36());
			resultupdate.setResult37(result.getResult37());
			resultupdate.setResult38(result.getResult38());
			resultupdate.setResult39(result.getResult39());
			resultupdate.setResult40(result.getResult40());
			userResultDAO.update(resultupdate);
			return "1";
		}else{
			Serializable s  = userResultDAO.save(result);
			if(s==null){
				return "0";
			} 
			result.setId(Long.parseLong(s.toString()));
			result.setUser(u);
			userResultDAO.update(result);
			return "1";
		}
		
		
	}
	@Override
	public String addSign(Sign sign) {
		
		Serializable s  = signDAO.save(sign);
		if(s==null){
			return "0";
		} 
		else {
		sign.setId(Long.parseLong(s.toString()));		
		return "1";
		}
	}

	public User  findUserByName(String userName){
		
		List<User> list =   userDAO.find("from User where userName='"+userName+"'");
		if(list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	
	public User  findUserByPhone(String userPhone){
		
		List<User> list =   userDAO.find("from User where cellphone='"+userPhone+"'");
		if(list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	
public String  forgetPassword(String Phone, String password){
		
		List<User> list = userDAO.find("from User where cellphone='"+Phone+"'");
		if(list.size()>0){
			User u = list.get(0);
			u.setPassword(StringUtil.getMD5Str(password));
			userDAO.update(u);
			return "1";
			//ajaxJson.setMsg("密码修改成功！");
		}else {
			return "0";
			//ajaxJson.setMsg("手机号码错误！");
		}
		
		
	}
	
	public User findUserById(int id){
		return null;
	}

	public void updatePassword(String userName, String oldPassWord, String newPassword){
		
	}

	public void updateUser(User User){
		
	}
	

	@Override
	public String find(String phone) {
		return phone;
		// TODO Auto-generated method stub
	}

}
