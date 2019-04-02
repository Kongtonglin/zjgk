package com.zjgk.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zjgk.DAO.BaseDAO;
import com.zjgk.DO.CommonQueryDO;
import com.zjgk.DO.CommonQueryResultDO;
import com.zjgk.entity.FreeMajor;
import com.zjgk.entity.FreeSchool;
import com.zjgk.entity.FreeSubject;
import com.zjgk.entity.MajorClassify;
import com.zjgk.entity.Province;
import com.zjgk.entity.School;
import com.zjgk.entity.SchoolProvince;
import com.zjgk.entity.SchoolRankFx;
import com.zjgk.entity.SchoolRankGlx;
import com.zjgk.entity.SchoolRankGx;
import com.zjgk.entity.SchoolRankJjx;
import com.zjgk.entity.SchoolRankJyx;
import com.zjgk.entity.SchoolRankLsx;
import com.zjgk.entity.SchoolRankLx;
import com.zjgk.entity.SchoolRankNx;
import com.zjgk.entity.SchoolRankShkx;
import com.zjgk.entity.SchoolRankWx;
import com.zjgk.entity.SchoolRankYx;
import com.zjgk.entity.SchoolRankZh;
import com.zjgk.entity.SchoolRankZrkx;
import com.zjgk.entity.SchoolRankZx;
import com.zjgk.entity.SchoolRecruitDetail;
import com.zjgk.entity.SchoolRecruitDetail2018;
import com.zjgk.entity.SchoolRecruitDl;
import com.zjgk.entity.SchoolRecruitDl2018;
import com.zjgk.entity.SchoolRecruitHistory;
import com.zjgk.entity.SchoolRecruitHistory2016;
import com.zjgk.entity.SchoolRecruitSyb;
import com.zjgk.entity.ScoreHistoryList;
import com.zjgk.entity.ScoreHistoryList2016;
import com.zjgk.entity.User;
import com.zjgk.service.CommonQueryService;

@Service("commonQueryService")
public class CommonQueryServiceImpl implements CommonQueryService {

	private static final Logger log = LoggerFactory.getLogger(CommonQueryServiceImpl.class);
	
	

	@Resource
	private BaseDAO<Province> provinceDAO;
	
	@Resource
	private BaseDAO<School> schoolDAO;

	@Resource
	private BaseDAO<SchoolProvince> schoolProvinceDAO;
	
	@Resource
	private BaseDAO<SchoolRankFx> schoolRankFxDAO;
	
	@Resource
	private BaseDAO<SchoolRankGlx> schoolRankGlxDAO;
	
	@Resource
	private BaseDAO<SchoolRankGx> schoolRankGxDAO;
	
	@Resource
	private BaseDAO<SchoolRankJjx> schoolRankJjxDAO;
	
	@Resource
	private BaseDAO<SchoolRankJyx> schoolRankJyxDAO;
	
	@Resource
	private BaseDAO<SchoolRankLsx> schoolRankLsxDAO;
	
	@Resource
	private BaseDAO<SchoolRankLx> schoolRankLxDAO;
	
	@Resource
	private BaseDAO<SchoolRankNx> schoolRankNxDAO;
	
	@Resource
	private BaseDAO<SchoolRankShkx> schoolRankShkxDAO;
	
	@Resource
	private BaseDAO<SchoolRankWx> schoolRankWxDAO;
	
	@Resource
	private BaseDAO<SchoolRankYx> schoolRankYxDAO;
	
	@Resource
	private BaseDAO<SchoolRankZh> schoolRankZhDAO;
	
	@Resource
	private BaseDAO<SchoolRankZrkx> schoolRankZrkxDAO;
	
	@Resource
	private BaseDAO<SchoolRankZx> schoolRankZxDAO;
	
	@Resource
	private BaseDAO<SchoolRecruitDetail> schoolRecruitDetailDAO;
	
	@Resource
	private BaseDAO<SchoolRecruitDetail2018> schoolRecruitDetail2018DAO;
	
	@Resource
	private BaseDAO<SchoolRecruitDl> schoolRecruitDlDAO;
	
	@Resource
	private BaseDAO<SchoolRecruitDl2018> schoolRecruitDl2018DAO;
	
	@Resource
	private BaseDAO<SchoolRecruitHistory> schoolRecruitHistoryDAO;
	
	@Resource
	private BaseDAO<SchoolRecruitHistory2016> schoolRecruitHistory2016DAO;
	
	@Resource
	private BaseDAO<SchoolRecruitSyb> schoolRecruitSybDAO;
	
	@Resource
	private BaseDAO<ScoreHistoryList> scoreHistoryListDAO;
	
	@Resource
	private BaseDAO<ScoreHistoryList2016> scoreHistoryList2016DAO;
	
	@Resource
	private BaseDAO<MajorClassify> majorClassifyDAO;
	
	
	
	
	public List<Province> getProvinceList(){
		  return  provinceDAO.find("from Province");
	}
	
	public List<Province> getProvinceListByOpenSession(){
		return  provinceDAO.findByOpenSession("from Province");
	}
	
	public List<School> getSchoolList(){
		  return  schoolDAO.find("from School");
	}
	
	public List<School> getSchoolListByOpenSession(){
		return  schoolDAO.findByOpenSession("from School");
	}
	
	public List<SchoolProvince> getSchoolProvinceList(){
		  return  schoolProvinceDAO.find("from SchoolProvince");
	}

	public List<SchoolRankFx> getSchoolRankFxListByOpenSession(){
		  return  schoolRankFxDAO.findByOpenSession("from SchoolRankFx");
	}

	public List<SchoolRankGlx> getSchoolRankGlxListByOpenSession(){
		  return  schoolRankGlxDAO.findByOpenSession("from SchoolRankGlx");
	}

	public List<SchoolRankGx> getSchoolRankGxListByOpenSession(){
		  return  schoolRankGxDAO.findByOpenSession("from SchoolRankGx");
	}

	public List<SchoolRankJjx> getSchoolRankJjxListByOpenSession(){
		  return  schoolRankJjxDAO.findByOpenSession("from SchoolRankJjx");
	}

	public List<SchoolRankJyx> getSchoolRankJyxListByOpenSession(){
		  return  schoolRankJyxDAO.findByOpenSession("from SchoolRankJyx");
	}

	public List<SchoolRankLsx> getSchoolRankLsxListByOpenSession(){
		  return  schoolRankLsxDAO.findByOpenSession("from SchoolRankLsx");
	}
	
	public List<SchoolRankLx> getSchoolRankLxListByOpenSession(){
		  return  schoolRankLxDAO.findByOpenSession("from SchoolRankLx");
	}
	
	public List<SchoolRankNx> getSchoolRankNxListByOpenSession(){
		  return  schoolRankNxDAO.findByOpenSession("from SchoolRankNx");
	}
	
	public List<SchoolRankShkx> getSchoolRankShkxListByOpenSession(){
		  return  schoolRankShkxDAO.findByOpenSession("from SchoolRankShkx");
	}
	
	public List<SchoolRankWx> getSchoolRankWxListByOpenSession(){
		  return  schoolRankWxDAO.findByOpenSession("from SchoolRankWx");
	}
	
	public List<SchoolRankYx> getSchoolRankYxListByOpenSession(){
		  return  schoolRankYxDAO.findByOpenSession("from SchoolRankYx");
	}
	
	public List<SchoolRankZh> getSchoolRankZhListByOpenSession(){
		  return  schoolRankZhDAO.findByOpenSession("from SchoolRankZh");
	}
	
	public List<SchoolRankZrkx> getSchoolRankZrkxListByOpenSession(){
		  return  schoolRankZrkxDAO.findByOpenSession("from SchoolRankZrkx");
	}
	
	public List<SchoolRankZx> getSchoolRankZxListByOpenSession(){
		  return  schoolRankZxDAO.findByOpenSession("from SchoolRankZx");
	}
	
	public List<SchoolRecruitDetail> getSchoolRecruitDetailList(){
		  return  schoolRecruitDetailDAO.find("from SchoolRecruitDetail");
	}
	
	public List<SchoolRecruitDetail2018> getSchoolRecruitDetailList2018(){
		  return  schoolRecruitDetail2018DAO.find("from SchoolRecruitDetail2018");
	}
	
	public List<SchoolRecruitDl> getSchoolRecruitDlList(){
		  return  schoolRecruitDlDAO.find("from SchoolRecruitDl");
	}
	
	public List<SchoolRecruitDl2018> getSchoolRecruitDlList2018(){
		  return  schoolRecruitDl2018DAO.find("from SchoolRecruitDl2018");
	}
	
	public List<SchoolRecruitHistory> getSchoolRecruitHistoryList(){
		  return  schoolRecruitHistoryDAO.find("from SchoolRecruitHistory");
	}
	
	public List<SchoolRecruitHistory2016> getSchoolRecruitHistoryList2016(){
		  return  schoolRecruitHistory2016DAO.find("from SchoolRecruitHistory2016");
	}
	
	public List<SchoolRecruitSyb> getSchoolRecruitSybList(){
		  return schoolRecruitSybDAO.find("from SchoolRecruitSyb");
	}
	
	public List<ScoreHistoryList> getScoreHistoryList(){
		  return  scoreHistoryListDAO.find("from ScoreHistoryList");
	}
	
	public List<ScoreHistoryList2016> getScoreHistoryList2016(){
		  return  scoreHistoryList2016DAO.find("from ScoreHistoryList2016");
	}
	
	public List<MajorClassify> getMajorClassifyList(){
		  return  majorClassifyDAO.find("from MajorClassify");
	}
	
   public List<MajorClassify> getMajorClassifyLevelOneList(){
	   return  majorClassifyDAO.find("from MajorClassify where level=1");
   }
	
   public List<MajorClassify> getMajorClassifyLevelTwoList(String code){
	   return  majorClassifyDAO.find("from MajorClassify where level=2 and code like '"+code+"%'");
   }
   
   
   /**
    * 普通专业
    */
   public  List<CommonQueryResultDO> recommondationCommon(User u, CommonQueryDO commonQueryDO){
	   //===================================step1 计算等位分==================
	   int rank = u.getRank(); 
	   
	   //2015年
	   long wkRank = ((long)rank*102800)/291300 ;
	   long lkRank = ((long)rank*177200)/291300 ;
       int wkScore = 0;
       int lkScore = 0;        
             
       /* //2017 
       long Rank =((long)rank*102800)/291300 ;
       int Score=0;
       List<ScoreHistoryList> scoreHistoryList2017 = scoreHistoryListDAO.find("from  ScoreHistoryList2017 where  year=2017 and rank<=" +Rank +" order by rank desc");
       
       if(scoreHistoryList2017!=null && scoreHistoryList2017.size()>0){
    	   Score = scoreHistoryList2017.get(0).getScore();
       }
       
       if(Rank<200 ){
    	   Score = 750;
       }
       
       List<SchoolProvince>  schoolProvinceList;
       if(commonQueryDO.getProvince().equals("-2")) {
    	 schoolProvinceList =schoolProvinceDAO.find("from SchoolProvince " );
       }
       else {
       schoolProvinceList =  schoolProvinceDAO.find("from SchoolProvince where province.id= "+commonQueryDO.getProvince());
       }
       String inSchool = "";
       
       for(SchoolProvince  schoolProvince: schoolProvinceList){
    	   inSchool = inSchool +",'"+schoolProvince.getSchool()+"'";
       } 
          
       String inSchool = "";
       
       for(SchoolProvince  schoolProvince: schoolProvinceList){
    	   inSchool = inSchool +",'"+schoolProvince.getSchool()+"'";
       } 
          
       
       inSchool = "("+inSchool.substring(1, inSchool.length()) +")";
       
       String majorCode = "";
       if(commonQueryDO.getMajorLevelTwo()==null || commonQueryDO.getMajorLevelTwo().equals("-1") || commonQueryDO.getMajorLevelTwo().equals("")){
    	   majorCode = commonQueryDO.getMajorLevelOne();
       }else{
    	   majorCode = commonQueryDO.getMajorLevelTwo();
       } 
       
      List<SchoolRecruitDetail2018> schoolRecruitDetailList2018 = schoolRecruitDetail2018DAO.find("from SchoolRecruitDetail2018 where majorCode like '"+majorCode+"%' and  school in "+inSchool);
       List<SchoolRecruitDl2018> schoolRecruitDlList2018 = schoolRecruitDl2018DAO.find("from SchoolRecruitDl2018 where majorCode like '"+majorCode+"%' and  school in "+inSchool);         
          System.out.println(schoolRecruitDlList2018);

       */
       
       
      
       //=================================2016=================================================================
       //成绩对比2016
       List<ScoreHistoryList2016> scoreHistoryListWk2016 = scoreHistoryList2016DAO.find("from  ScoreHistoryList2016 where wl=0 and year=2016 and rank<=" +wkRank +" order by rank desc");
       List<ScoreHistoryList2016> scoreHistoryListLk2016 = scoreHistoryList2016DAO.find("from  ScoreHistoryList2016 where wl=1 and year=2016 and rank<=" +lkRank +" order by rank desc");
       if(scoreHistoryListWk2016!=null && scoreHistoryListWk2016.size()>0){
    	   wkScore = scoreHistoryListWk2016.get(0).getScore();
       }
       if(scoreHistoryListLk2016!=null && scoreHistoryListLk2016.size()>0){
    	   lkScore = scoreHistoryListLk2016.get(0).getScore();
       }
       //排名前面，按750满分计算
       if(wkRank<204 || lkRank<312){
    	   wkScore = 750;
    	   lkScore = 750;
       }
       
       //=================================step2 获取可以报考的学校、专业、2015可以报考的专业=============
       List<SchoolProvince>  schoolProvinceList;
       if(commonQueryDO.getProvince().equals("-2")) {
    	 schoolProvinceList =schoolProvinceDAO.find("from SchoolProvince " );
       }
       else {
       schoolProvinceList =  schoolProvinceDAO.find("from SchoolProvince where province.id= "+commonQueryDO.getProvince());
       }
       String inSchool = "";
       
       for(SchoolProvince  schoolProvince: schoolProvinceList){
    	   inSchool = inSchool +",'"+schoolProvince.getSchool()+"'";
       } 
          
       
       inSchool = "("+inSchool.substring(1, inSchool.length()) +")";
       
       String majorCode = "";
       if(commonQueryDO.getMajorLevelTwo()==null || commonQueryDO.getMajorLevelTwo().equals("-1") || commonQueryDO.getMajorLevelTwo().equals("")){
    	   majorCode = commonQueryDO.getMajorLevelOne();
       }else{
    	   majorCode = commonQueryDO.getMajorLevelTwo();
       } 
       
    // List<SchoolRecruitDetail> schoolRecruitDetailList = schoolRecruitDetailDAO.find("from SchoolRecruitDetail where majorCode like '"+majorCode+"%' and  school in "+inSchool);
       

     
       List<SchoolRecruitDetail2018> schoolRecruitDetailList2018 = schoolRecruitDetail2018DAO.find("from SchoolRecruitDetail2018 where majorCode like '"+majorCode+"%' and  school in "+inSchool);
      List<SchoolRecruitDl2018> schoolRecruitDlList2018 = schoolRecruitDl2018DAO.find("from SchoolRecruitDl2018 where majorCode like '"+majorCode+"%' and  school in "+inSchool);         
         System.out.println(schoolRecruitDlList2018);
      
       //================================step3计算概率=============================
      
      List<CommonQueryResultDO> listResult = new ArrayList<CommonQueryResultDO>();
       System.out.println(schoolRecruitDetailList2018);
       
       for(SchoolRecruitDetail2018 schoolRecruitDetail2018 : schoolRecruitDetailList2018){
    	   String hql = "from SchoolRecruitHistory2016 where year=2016 and school='"
    			   				+schoolRecruitDetail2018.getSchool() +"' and majorCode= '" 
    			   				+ schoolRecruitDetail2018.getMajorCode() +"'";
    	   String hql2 = "from School where school='"
	   				+schoolRecruitDetail2018.getSchool() +"'";
    	   System.out.println("显示数据库操作"+hql);
    	   List<SchoolRecruitHistory2016> schoolRecruitHistoryList2016 = schoolRecruitHistory2016DAO.find(hql);
    	   List<School> schoolList2016=schoolDAO.find(hql2);
    	   
    	   if(schoolRecruitHistoryList2016!=null && schoolRecruitHistoryList2016.size()>0){
    		   for(SchoolRecruitHistory2016 history: schoolRecruitHistoryList2016){
    			   CommonQueryResultDO  resultDo = new CommonQueryResultDO();
    			   if(history.getWl()==0){
    				   if(history.getLowScore()<=wkScore){
    					   resultDo.setMajorCode(schoolRecruitDetail2018.getMajorCode());
    					   resultDo.setMajorDetail(schoolRecruitDetail2018.getMajorDetail());
    					  
    					   int probability = 0;
    					   if(history.getAvgScore()-history.getLowScore()>0){
    						   probability =  (wkScore-history.getLowScore())*100/(history.getAvgScore()-history.getLowScore());
    					   }else{
    						   probability = 100;
    					   }
    					   if(probability>100) {
    						   probability = 100;
    					   resultDo.setProbability(probability+"");
    					   resultDo.setSchool(schoolRecruitDetail2018.getSchool());
    					   //resultDo.setSchoolCode(schoolRecruitDetail2018.getSubject1());

    					   for(School net: schoolList2016){
    					   resultDo.setSchoolCode(net.getSchoolCode());
    					   }
    					   
    					   for(School net: schoolList2016){
        					   resultDo.setSchoolNet(net.getNet());
        					   }
    					   
    					   listResult.add(resultDo);
    					   }
    				   } 
    			   }else if(history.getWl()==1){
    				   if(history.getLowScore()<=lkScore){

    					   resultDo.setMajorCode(schoolRecruitDetail2018.getMajorCode());
    					   resultDo.setMajorDetail(schoolRecruitDetail2018.getMajorDetail());
    					   int probability = 0;
    					   if(history.getAvgScore()-history.getLowScore()>0){
    						   probability =  (lkScore-history.getLowScore())*100/(history.getAvgScore()-history.getLowScore());
    					   }else{
    						   probability = 100;
    					   }
    					   if(probability>100) 
    						   probability = 100;
    					   resultDo.setProbability(probability+"");
    					   resultDo.setSchool(schoolRecruitDetail2018.getSchool());
    					  // resultDo.setSchoolCode(schoolRecruitDetail2018.getSubject1());
    					   for(School net: schoolList2016){
        					   resultDo.setSchoolCode(net.getSchoolCode());
        					   }
    					   
    					   for(School net: schoolList2016){
        					   resultDo.setSchoolNet(net.getNet());
        					   }
    					   listResult.add(resultDo);
    				   }
    			   }
    		   }
    	   }
    	   
       }   
       System.out.println("大类专业");
	  // return  listResult;
	   
	   //===================================大类==========================================================   
	   
       
       for(SchoolRecruitDl2018 schoolRecruitDl2018 : schoolRecruitDlList2018){
    	   
    	//获取该大类下所有专业
    	String hqlDlCode = "from SchoolRecruitDl2018 where dlCode = '" + schoolRecruitDl2018.getDlCode()+"'";
    	
       	List<SchoolRecruitDl2018>listDl2018 =  schoolRecruitDl2018DAO.find(hqlDlCode);
        String hql2 = "from School where school='"
   				+schoolRecruitDl2018.getSchool() +"'";
	   List<School> schoolList2016=schoolDAO.find(hql2);
    	//概率：所有此大类下专业概率的平均值
		int probability = 0;
		int size = 0;
		
		CommonQueryResultDO  resultDo = new CommonQueryResultDO();
		resultDo.setMajorCode(schoolRecruitDl2018.getMajorCode());
	    resultDo.setMajorDetail("（大类）"+schoolRecruitDl2018.getDl());//改变显示专业类型信息
	    resultDo.setSchool(schoolRecruitDl2018.getSchool());
	    for(School net: schoolList2016){
			   resultDo.setSchoolCode(net.getSchoolCode());
			   }
	    for(School net: schoolList2016){
			   resultDo.setSchoolNet(net.getNet());
			   }
	    //循环所有专业
       	if(listDl2018!=null && listDl2018.size()>0){
       		for(SchoolRecruitDl2018 dl2018: listDl2018){
       			
       		     String hql = "from SchoolRecruitHistory2016 where year=2016 and school='"
		   				+dl2018.getSchool() +"' and majorCode= '" 
		   				+ dl2018.getMajorCode() +"'";
       		     
				List<SchoolRecruitHistory2016> schoolRecruitHistoryList2016 = schoolRecruitHistory2016DAO.find(hql);
				 int currentProbability = 0;
				if(schoolRecruitHistoryList2016!=null && schoolRecruitHistoryList2016.size()>0){
					SchoolRecruitHistory2016 history = schoolRecruitHistoryList2016.get(0);
						  
						   if(history.getWl()==0){
							   if(history.getLowScore()<=wkScore){
								   if(history.getAvgScore()-history.getLowScore()>0){
									   currentProbability =  (wkScore-history.getLowScore())*100/(history.getAvgScore()-history.getLowScore());
								   }else{
									   currentProbability = 100;
								   }
								   if(currentProbability>100) 
									   currentProbability = 100;
							   }
						   }else if(history.getWl()==1){
							   if(history.getLowScore()<=lkScore){
								   if(history.getAvgScore()-history.getLowScore()>0){
									   currentProbability =  (lkScore-history.getLowScore())*100/(history.getAvgScore()-history.getLowScore());
								   }else{
									   currentProbability = 100;
								   }
								   if(currentProbability>100) 
									   currentProbability = 100;
							   }
						   }
						   //获得概率，长度加1
						   if(currentProbability>0){
							   probability = probability + currentProbability;
							   size++;
						   }
						 
					   }
					 
				}

       		}
       	
	       	if(size>0){
	           resultDo.setProbability(probability/size+"");
			   listResult.add(resultDo);
	       	}
       	}
       
       //================去除重复项===========================
      for ( int i = 0 ; i < listResult.size() - 1 ; i ++ ) { 
    	   for ( int j = listResult.size() - 1 ; j > i; j -- ) { 
    		   if (listResult.get(j).getSchool().equals(listResult.get(i).getSchool())&&listResult.get(j).getMajorDetail().equals(listResult.get(i).getMajorDetail())    ) { 
    			   listResult.remove(j); 
    	   		} 
    	   } 
       }
	   return  listResult;
	 
   }

  
}
