package com.zjgk.service;

import java.util.List;

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

public interface CommonQueryService {
  
	public List<Province> getProvinceList();
	 //for init data 
   	public List<Province> getProvinceListByOpenSession();
    
    public List<School> getSchoolList();
	 //for init data 
    public List<School> getSchoolListByOpenSession();
   
	public List<SchoolProvince> getSchoolProvinceList();

	public List<SchoolRankFx> getSchoolRankFxListByOpenSession();

	public List<SchoolRankGlx> getSchoolRankGlxListByOpenSession();

	public List<SchoolRankGx> getSchoolRankGxListByOpenSession();

	public List<SchoolRankJjx> getSchoolRankJjxListByOpenSession();

	public List<SchoolRankJyx> getSchoolRankJyxListByOpenSession();

	public List<SchoolRankLsx> getSchoolRankLsxListByOpenSession();
	
	public List<SchoolRankLx> getSchoolRankLxListByOpenSession();
	
	public List<SchoolRankNx> getSchoolRankNxListByOpenSession();
	
	public List<SchoolRankShkx> getSchoolRankShkxListByOpenSession();
	
	public List<SchoolRankWx> getSchoolRankWxListByOpenSession();
	
	public List<SchoolRankYx> getSchoolRankYxListByOpenSession();
	
	public List<SchoolRankZh> getSchoolRankZhListByOpenSession();
	
	public List<SchoolRankZrkx> getSchoolRankZrkxListByOpenSession();
	
	public List<SchoolRankZx> getSchoolRankZxListByOpenSession();
	
	public List<SchoolRecruitDetail> getSchoolRecruitDetailList();
	
	public List<SchoolRecruitDetail2018> getSchoolRecruitDetailList2018();

	public List<SchoolRecruitDl> getSchoolRecruitDlList();
	
	public List<SchoolRecruitDl2018> getSchoolRecruitDlList2018();
	
	public List<SchoolRecruitHistory> getSchoolRecruitHistoryList();
	
	public List<SchoolRecruitHistory2016> getSchoolRecruitHistoryList2016();
	
	public List<SchoolRecruitSyb> getSchoolRecruitSybList();
	
	public List<ScoreHistoryList> getScoreHistoryList();
	
	public List<ScoreHistoryList2016> getScoreHistoryList2016();
	
	public List<MajorClassify> getMajorClassifyList();
	
	public List<MajorClassify> getMajorClassifyLevelOneList();
	
	public List<MajorClassify> getMajorClassifyLevelTwoList(String code);
	
    public List<CommonQueryResultDO> recommondationCommon(User u, CommonQueryDO commonQueryDO);
    
   // public List<CommonQueryResultDO> recommondationDl(User u, CommonQueryDO commonQueryDO);
    
   // public List<CommonQueryResultDO> recommondationSyb(User u, CommonQueryDO commonQueryDO);
	 
  
}
