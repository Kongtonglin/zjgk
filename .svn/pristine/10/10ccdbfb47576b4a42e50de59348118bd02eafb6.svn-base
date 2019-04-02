package com.zjgk.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjgk.DAO.BaseDAO;
import com.zjgk.DO.BackstageDO;
import com.zjgk.DO.enumDO.Subjects;
import com.zjgk.entity.User;
import com.zjgk.entity.UserResult;
import com.zjgk.entity.UserScore;
import com.zjgk.service.BackstageService;
import com.zjgk.service.CommonQueryService;
import com.zjgk.service.UserScoreService;


@Service("BackstageService")
public  class BackstageImpl implements BackstageService{
	
	private static final Logger log = LoggerFactory.getLogger(CommonQueryServiceImpl.class);

	@Autowired
	private UserScoreService userScoreService;
	
	@Resource
	private BaseDAO<User> userDAO;
	
	@Resource
	private BaseDAO<UserScore> userscoreDAO;
	
	@Resource
	private BaseDAO<UserResult> userresultDAO;
	public List<User> getUserIdList(){
		  return  userDAO.find("from User");
	}
	
	public List<UserScore> getUserScoreIdList(){
		  return  userscoreDAO.find("from UserScore");
	}
	@Override
	public List<BackstageDO> BackstageCommon() {
		List<BackstageDO> listResult = new ArrayList<BackstageDO>();
		

		 String name=null;
		 String score=null;		
		 Subjects subject=null;
		 int rank;
		 int Finalscore=0;
		 String Finalsubject="";
		 String resubject=null;
		 Date time=null;
		 String dateStr=null;  
		 String list=null;
		 Long id=null;
		 List<User> User = userDAO.find("from User");
		 for(int i=0;i<User.size();i++){
			 BackstageDO  resultDo = new BackstageDO();
	       if(User!=null && User.size()>0){
	    	  
	    	   id   = User.get(i).getId(); 
	    	   name = User.get(i).getUserName();
	    	   rank = User.get(i).getRank();
	    	   
	    	  
	    	  // userScoreService.getUserScoreList(User);
		       List<UserResult> UserResult = userresultDAO.find("from UserResult where user_id = "+id+"");//计算总分
		       if(UserResult!=null && UserResult.size()>0){
		    	   time = UserResult.get(0).getChangeDate();
		    	   dateStr=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(time);
		       }
		       else {
		    	   dateStr="用户未查询";
		       }
		       
		       List<UserScore> UserScore = userscoreDAO.find("from UserScore where user_id = "+id+"");//计算总分
		       if(UserScore!=null && UserScore.size()>0){
		    	   for(int j=0;j<UserScore.size();j++){
		    		   score = UserScore.get(j).getScore();
		    		   Finalscore+=Integer.parseInt(score);
		    	   }
		    	   score=Integer.toString(Finalscore);
		    	   Finalscore=0;
		       }
		       
		       List<UserScore> UserSubject = userscoreDAO.find("from UserScore where user_id = "+id+"");//计算总分
		       if(UserSubject!=null && UserSubject.size()>0){
		    	   for(int j=3;j<UserSubject.size();j++){
		    		   subject =UserSubject.get(j).getSubject();
		    		   Finalsubject+=subject+";";
		    	   }
		    	   resubject=Finalsubject;
		    	   Finalsubject="";
		       }
		       List<UserResult> Userresult = userresultDAO.find("from UserResult where user_id = "+id+"");//计算总分
		       if(Userresult!=null && Userresult.size()>0){
		    	   list=Userresult.get(0).getResult01()+
		    			   Userresult.get(0).getResult02()+
		    			   Userresult.get(0).getResult03()+
		    			   Userresult.get(0).getResult04()+
		    			   Userresult.get(0).getResult05()+
		    			   Userresult.get(0).getResult06();
		       }
		       else {
		    	   list="用户未查询";
		       }
		       resultDo.setName(name);
		       resultDo.setRank(rank);
		       resultDo.setTime(dateStr);
		       resultDo.setScore(score);
		       resultDo.setSubject(resubject);
		       resultDo.setList(list);
		       }
		       listResult.add(resultDo);
	    	  }
	       
		
		return listResult;
	}

	

	
	


}