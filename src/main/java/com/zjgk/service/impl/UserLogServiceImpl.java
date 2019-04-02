package com.zjgk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zjgk.DAO.BaseDAO;
import com.zjgk.entity.User;
import com.zjgk.entity.UserLog;
import com.zjgk.service.UserLogService;

@Service("userLogService")
public class UserLogServiceImpl implements UserLogService {

	private static final Logger log = LoggerFactory.getLogger(UserLogServiceImpl.class);

 
	@Resource
	private BaseDAO<UserLog> userLogDAO;

	public List<UserLog>  getUserLogList(User u) {
		List<UserLog> list =   userLogDAO.find("from UserLog us where us.user.id="+u.getId()+"");
		return list;
	}
	
	public void save(UserLog userLog){
		userLogDAO.save(userLog);
	}
  
}
