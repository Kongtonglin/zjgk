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
import com.zjgk.DO.CommonQueryResultDO2017;
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
import com.zjgk.entity.SchoolRecruitHistory2017;
import com.zjgk.entity.SchoolRecruitSyb;
import com.zjgk.entity.ScoreHistoryList;
import com.zjgk.entity.ScoreHistoryList2016;
import com.zjgk.entity.ScoreHistoryList2017;

import com.zjgk.entity.User;
import com.zjgk.service.CommonQueryService;
import com.zjgk.service.CommonQueryService2017;

@Service("commonQueryService2017")
public class CommonQueryServiceImpl2017 implements CommonQueryService2017 {

	private static final Logger log = LoggerFactory.getLogger(CommonQueryServiceImpl2017.class);

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
	private BaseDAO<SchoolRecruitHistory2017> schoolRecruitHistory2017DAO;

	@Resource
	private BaseDAO<SchoolRecruitSyb> schoolRecruitSybDAO;

	@Resource
	private BaseDAO<ScoreHistoryList> scoreHistoryListDAO;

	@Resource
	private BaseDAO<ScoreHistoryList2016> scoreHistoryList2016DAO;

	@Resource
	private BaseDAO<ScoreHistoryList2017> scoreHistoryList2017DAO;

	@Resource
	private BaseDAO<MajorClassify> majorClassifyDAO;

	public List<Province> getProvinceList() {
		return provinceDAO.find("from Province");
	}

	public List<Province> getProvinceListByOpenSession() {
		return provinceDAO.findByOpenSession("from Province");
	}

	public List<School> getSchoolList() {
		return schoolDAO.find("from School");
	}

	public List<School> getSchoolListByOpenSession() {
		return schoolDAO.findByOpenSession("from School");
	}

	public List<SchoolProvince> getSchoolProvinceList() {
		return schoolProvinceDAO.find("from SchoolProvince");
	}

	public List<SchoolRankFx> getSchoolRankFxListByOpenSession() {
		return schoolRankFxDAO.findByOpenSession("from SchoolRankFx");
	}

	public List<SchoolRankGlx> getSchoolRankGlxListByOpenSession() {
		return schoolRankGlxDAO.findByOpenSession("from SchoolRankGlx");
	}

	public List<SchoolRankGx> getSchoolRankGxListByOpenSession() {
		return schoolRankGxDAO.findByOpenSession("from SchoolRankGx");
	}

	public List<SchoolRankJjx> getSchoolRankJjxListByOpenSession() {
		return schoolRankJjxDAO.findByOpenSession("from SchoolRankJjx");
	}

	public List<SchoolRankJyx> getSchoolRankJyxListByOpenSession() {
		return schoolRankJyxDAO.findByOpenSession("from SchoolRankJyx");
	}

	public List<SchoolRankLsx> getSchoolRankLsxListByOpenSession() {
		return schoolRankLsxDAO.findByOpenSession("from SchoolRankLsx");
	}

	public List<SchoolRankLx> getSchoolRankLxListByOpenSession() {
		return schoolRankLxDAO.findByOpenSession("from SchoolRankLx");
	}

	public List<SchoolRankNx> getSchoolRankNxListByOpenSession() {
		return schoolRankNxDAO.findByOpenSession("from SchoolRankNx");
	}

	public List<SchoolRankShkx> getSchoolRankShkxListByOpenSession() {
		return schoolRankShkxDAO.findByOpenSession("from SchoolRankShkx");
	}

	public List<SchoolRankWx> getSchoolRankWxListByOpenSession() {
		return schoolRankWxDAO.findByOpenSession("from SchoolRankWx");
	}

	public List<SchoolRankYx> getSchoolRankYxListByOpenSession() {
		return schoolRankYxDAO.findByOpenSession("from SchoolRankYx");
	}

	public List<SchoolRankZh> getSchoolRankZhListByOpenSession() {
		return schoolRankZhDAO.findByOpenSession("from SchoolRankZh");
	}

	public List<SchoolRankZrkx> getSchoolRankZrkxListByOpenSession() {
		return schoolRankZrkxDAO.findByOpenSession("from SchoolRankZrkx");
	}

	public List<SchoolRankZx> getSchoolRankZxListByOpenSession() {
		return schoolRankZxDAO.findByOpenSession("from SchoolRankZx");
	}

	public List<SchoolRecruitDetail> getSchoolRecruitDetailList() {
		return schoolRecruitDetailDAO.find("from SchoolRecruitDetail");
	}

	public List<SchoolRecruitDetail2018> getSchoolRecruitDetailList2018() {
		return schoolRecruitDetail2018DAO.find("from SchoolRecruitDetail2018");
	}

	public List<SchoolRecruitDl> getSchoolRecruitDlList() {
		return schoolRecruitDlDAO.find("from SchoolRecruitDl");
	}

	public List<SchoolRecruitDl2018> getSchoolRecruitDlList2018() {
		return schoolRecruitDl2018DAO.find("from SchoolRecruitDl2018");
	}

	public List<SchoolRecruitHistory> getSchoolRecruitHistoryList() {
		return schoolRecruitHistoryDAO.find("from SchoolRecruitHistory");
	}

	public List<SchoolRecruitHistory2016> getSchoolRecruitHistoryList2016() {
		return schoolRecruitHistory2016DAO.find("from SchoolRecruitHistory2016");
	}

	public List<SchoolRecruitHistory2017> getSchoolRecruitHistoryList2017() {
		return schoolRecruitHistory2017DAO.find("from SchoolRecruitHistory2017");
	}

	public List<SchoolRecruitSyb> getSchoolRecruitSybList() {
		return schoolRecruitSybDAO.find("from SchoolRecruitSyb");
	}

	public List<ScoreHistoryList> getScoreHistoryList() {
		return scoreHistoryListDAO.find("from ScoreHistoryList");
	}

	public List<ScoreHistoryList2016> getScoreHistoryList2016() {
		return scoreHistoryList2016DAO.find("from ScoreHistoryList2016");
	}

	public List<ScoreHistoryList2017> getScoreHistoryList2017() {
		return scoreHistoryList2017DAO.find("from ScoreHistoryList2017");
	}

	public List<MajorClassify> getMajorClassifyList() {
		return majorClassifyDAO.find("from MajorClassify");
	}

	public List<MajorClassify> getMajorClassifyLevelOneList() {
		return majorClassifyDAO.find("from MajorClassify where level=1");
	}

	public List<MajorClassify> getMajorClassifyLevelTwoList(String code) {
		return majorClassifyDAO.find("from MajorClassify where level=2 and code like '" + code + "%'");
	}

	/**
	 * 普通专业
	 */
	public List<CommonQueryResultDO> recommondationCommon(User u, CommonQueryDO commonQueryDO,String[] pro,String[] lev,String[] levT) {
		int time1;
		int time2;
		String prov;
		String leve;
		String leveT;
		time1=pro.length;
		time2=lev.length;
		List<CommonQueryResultDO> listResult = new ArrayList<CommonQueryResultDO>();//定义结果list
		for (int a = 0; a < time1; a++) {//循环遍历
			 prov=pro[a];
			 if(prov.length()<2) {
			 prov=prov.substring(0,1);
			 }
			 else {
				 prov=prov.substring(0,2);
			 }
			 commonQueryDO.setProvince(prov);
			 for (int b = 0; b < time2; b++) {
				 leve=lev[b]; 
				 leve=leve.substring(0,2);
				 commonQueryDO.setMajorLevelOne(leve);
				 leveT=levT[b]; 
				
				 commonQueryDO.setMajorLevelTwo(leveT);
		// ===================================step1 计算等位分==================
		int rank = u.getRank();

		// 2017
		long Rank = rank;// 同位分2018

		//long Rank = ((long) rank * 102800) / 291300;// 同位分2017
		int Score = 0;
		List<ScoreHistoryList2017> scoreHistoryList2017 = scoreHistoryList2017DAO
				.find("from  ScoreHistoryList2017 where  year=2017 and rank<=" + Rank + " order by rank desc");
//通过排名获取同为分
		if (scoreHistoryList2017 != null && scoreHistoryList2017.size() > 0) {
			Score = scoreHistoryList2017.get(0).getScore();
		}

		if (Rank < 200) {
			Score = 750;//前200名为满分处理
		}

		List<SchoolProvince> schoolProvinceList;//得到省份列表
		SchoolProvince schoolresult =new SchoolProvince();//省份子集
		
		if (commonQueryDO.getProvince().equals("-2")) {
			schoolProvinceList = schoolProvinceDAO.find("from SchoolProvince");//搜索所有省份
		} else {
			schoolProvinceList = schoolProvinceDAO
					.find("from SchoolProvince where province.id= " + commonQueryDO.getProvince());//查找特定省份
		}
		String inSchool = "";

		for (SchoolProvince schoolProvince : schoolProvinceList) {
			inSchool = inSchool + ",'" + schoolProvince.getSchool() + "'";
		}


		inSchool = "(" + inSchool.substring(1, inSchool.length()) + ")";//获取对应省份的所有学校并连接

		String majorCode = "";
		if (commonQueryDO.getMajorLevelTwo() == null || commonQueryDO.getMajorLevelTwo().equals("-1")
				|| commonQueryDO.getMajorLevelTwo().equals("")) {
			majorCode = commonQueryDO.getMajorLevelOne();
		} else {
			majorCode = commonQueryDO.getMajorLevelTwo();
		}
		//获取前台的专业代码（4位）
		List<SchoolRecruitDetail2018> schoolRecruitDetailList2018 = schoolRecruitDetail2018DAO.find(
				"from SchoolRecruitDetail2018 where majorCode like '" + majorCode + "%' and  school in " + inSchool);//寻找普通专业的符合要求的列表
		
		
		
		// ================================step3计算概率=============================

		
		System.out.println(schoolRecruitDetailList2018);

		for (SchoolRecruitDetail2018 schoolRecruitDetail2018 : schoolRecruitDetailList2018) {
			String hql = "from SchoolRecruitHistory2017 where year=2017 and school='"
					+ schoolRecruitDetail2018.getSchool() + "' and majorCode= '"
					+ schoolRecruitDetail2018.getMajorCode() + "'";
			//寻找去年的相应代码和学校的成绩列表
			
			String hql2 = "from School where school='" + schoolRecruitDetail2018.getSchool() + "'";//寻找对应的学校信息用于获得网站地址和学校代码
			System.out.println("显示数据库操作" + hql);
			List<School> schoolList2017 = schoolDAO.find(hql2);
			List<SchoolRecruitHistory2017> schoolRecruitHistoryList2017 = schoolRecruitHistory2017DAO.find(hql);//执行数据库代码

			if (schoolRecruitHistoryList2017 != null && schoolRecruitHistoryList2017.size() > 0) {
				for (SchoolRecruitHistory2017 history : schoolRecruitHistoryList2017) {
					CommonQueryResultDO resultDo = new CommonQueryResultDO();//结果子集
					if (history.getLowScore() <= Score) {//历史最低分小于同位分满足要求
						resultDo.setMajorCode(schoolRecruitDetail2018.getMajorCode());
						resultDo.setMajorDetail(schoolRecruitDetail2018.getMajorDetail());//set专业代码与专业详情

						int probability = 0;//录取概率
						if (history.getAvgScore() - history.getLowScore() > 0) {
							probability = (Score - history.getLowScore()) * 100
									/ (history.getAvgScore() - history.getLowScore());//概率算法
						} else {
							probability = 100;
						}
						if (probability > 100) {
							probability = 100;	
						}
						resultDo.setProbability(probability + "");
						resultDo.setSchool(schoolRecruitDetail2018.getSchool());
						//设置概率，原学校网址和学校代码放置
						for (School net : schoolList2017) {
							resultDo.setSchoolCode(net.getSchoolCode());
						}

						for (School net : schoolList2017) {
							resultDo.setSchoolNet(net.getNet());
						}
						for (SchoolRecruitHistory2017 low_score : schoolRecruitHistoryList2017) {
							resultDo.setLowScore(low_score.getLowScore());
						}//设置最低分
						
						if(probability>85) {//概率大于百分之85%显示结果，其余筛去
						listResult.add(resultDo);//添加结果集
						}
					}

				}
			}

		}
		System.out.println("大类专业");
		// return listResult;
		List<SchoolRecruitDl2018> schoolRecruitDlList2018 = schoolRecruitDl2018DAO
				.find("from SchoolRecruitDl2018 where majorCode like '" + majorCode + "%' and  school in " + inSchool);//寻找大类专业的列表
		System.out.println(schoolRecruitDlList2018);
		// ===================================大类==========================================================
		 for(SchoolRecruitDl2018 schoolRecruitDl2018 : schoolRecruitDlList2018){
		    	//获取该大类下所有专业
		    	String hqlDlCode = "from SchoolRecruitDl2018 where dlCode = '" + schoolRecruitDl2018.getDlCode()+"'";
		       	List<SchoolRecruitDl2018>listDl2018 =  schoolRecruitDl2018DAO.find(hqlDlCode);
		        String hql2 = "from School where school='"
		   				+schoolRecruitDl2018.getSchool() +"'";
			   List<School> schoolList2017=schoolDAO.find(hql2);
		    	//概率：所有此大类下专业概率的平均值
				int probability = 0;
				int size = 0;
				
				CommonQueryResultDO  resultDo = new CommonQueryResultDO();
				resultDo.setMajorCode(schoolRecruitDl2018.getMajorCode());
			    resultDo.setMajorDetail("（大类）"+schoolRecruitDl2018.getDl());//改变显示专业类型信息
			    resultDo.setSchool(schoolRecruitDl2018.getSchool());
			    for(School net: schoolList2017){
					   resultDo.setSchoolCode(net.getSchoolCode());
					   }
			    for(School net: schoolList2017){
					   resultDo.setSchoolNet(net.getNet());
					   }
			   
			    //循环所有专业
		       	if(listDl2018!=null && listDl2018.size()>0){
		       		for(SchoolRecruitDl2018 dl2018: listDl2018){
						 int currentProbability = 0;
		       		//大类代码查询规则
		       		     String hqldl = "from SchoolRecruitHistory2017 where year=2017 and school='"
				   				+dl2018.getSchool() +"' and dl= '" 
				   				+ dl2018.getDlCode() +"'";
							List<SchoolRecruitHistory2017> schoolRecruitHistoryList2017dl = schoolRecruitHistory2017DAO.find(hqldl);
							
							if(schoolRecruitHistoryList2017dl!=null && schoolRecruitHistoryList2017dl.size()>0){
								SchoolRecruitHistory2017 history = schoolRecruitHistoryList2017dl.get(0);
										   if(history.getLowScore()<=Score){
											   if(history.getAvgScore()-history.getLowScore()>0){
												   currentProbability =  (Score-history.getLowScore())*100/(history.getAvgScore()-history.getLowScore());
											   }else{
												   currentProbability = 100;
											   }
											   if(currentProbability>100) 
												   currentProbability = 100;
										   }
									   
									   //获得概率，长度加1
									   if(currentProbability>0){
										   probability = probability + currentProbability;
										   size++;
									   }
									   for (SchoolRecruitHistory2017 low_score : schoolRecruitHistoryList2017dl) {
											resultDo.setLowScore(low_score.getLowScore());
										}//设置最低分
								   }
							
							else {
		       		     String hql = "from SchoolRecruitHistory2017 where year=2017 and school='"
				   				+dl2018.getSchool() +"' and majorCode= '" 
				   				+ dl2018.getMajorCode() +"'";
		       		     

						List<SchoolRecruitHistory2017> schoolRecruitHistoryList2017 = schoolRecruitHistory2017DAO.find(hql);
						if(schoolRecruitHistoryList2017!=null && schoolRecruitHistoryList2017.size()>0){
							SchoolRecruitHistory2017 history = schoolRecruitHistoryList2017.get(0);
								  
								   
									   if(history.getLowScore()<=Score){
										   if(history.getAvgScore()-history.getLowScore()>0){
											   currentProbability =  (Score-history.getLowScore())*100/(history.getAvgScore()-history.getLowScore());
										   }else{
											   currentProbability = 100;
										   }
										   if(currentProbability>100) 
											   currentProbability = 100;
									   }
								   
									   
								   //获得概率，长度加1
								   if(currentProbability>0){
									   probability = probability + currentProbability;
									   size++;
								   }
								   for (SchoolRecruitHistory2017 low_score : schoolRecruitHistoryList2017) {
										resultDo.setLowScore(low_score.getLowScore());
									}//设置最低分
							   }
							}
						}

		       		}
		       	
			       	if(size>0){
			           resultDo.setProbability(probability/size+"");
			           if(probability>85) {//录取概率大于85显示
					   listResult.add(resultDo);
			           }
			       	}
		       	}
		// ================去除重复项===========================
		for (int i = 0; i < listResult.size() - 1; i++) {
			for (int j = listResult.size() - 1; j > i; j--) {
				if(listResult.get(j).getSchool()!=null&&listResult.get(j).getMajorDetail()!=null) {
				if (listResult.get(j).getSchool().equals(listResult.get(i).getSchool())
						&& listResult.get(j).getMajorDetail().equals(listResult.get(i).getMajorDetail())) {
					listResult.remove(j);
				}
				}
			}
		}
			 
			 }
		}
		return listResult;
	}

	
}
