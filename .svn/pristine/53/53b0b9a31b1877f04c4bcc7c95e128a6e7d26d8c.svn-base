package com.zjgk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zjgk.DAO.BaseDAO;
import com.zjgk.entity.User;
import com.zjgk.entity.UserScore;
import com.zjgk.service.UserScoreService;

@Service("userService")
public class UserScoreServiceImpl implements UserScoreService {

	private static final Logger log = LoggerFactory.getLogger(UserScoreServiceImpl.class);

 
	@Resource
	private BaseDAO<UserScore> userScoreDAO;

 

	public List<UserScore>  getUserScoreList(User u) {
		
		List<UserScore> list =   userScoreDAO.find("from UserScore us where us.user.id="+u.getId()+"");
		return list;
	}
 

}
