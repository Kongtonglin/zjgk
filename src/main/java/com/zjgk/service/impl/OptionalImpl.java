package com.zjgk.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zjgk.DAO.BaseDAO;
import com.zjgk.DO.CommonOptional;
import com.zjgk.DO.CommonOptionalResult;
import com.zjgk.DO.CommonQueryResultDO;
import com.zjgk.entity.FreeMajor;
import com.zjgk.entity.FreeMajors100;
import com.zjgk.entity.FreeMajors150;
import com.zjgk.entity.FreeMajors200;
import com.zjgk.entity.FreeMajors250;
import com.zjgk.entity.FreeMajors300;
import com.zjgk.entity.FreeMajors50;
import com.zjgk.entity.FreeMajorsAll;
import com.zjgk.entity.FreeSchool;
import com.zjgk.entity.FreeSubject;
import com.zjgk.entity.ScoreHistoryList2016;
import com.zjgk.service.OptionalService;


@Service("OptionalService")
public  class OptionalImpl implements OptionalService{
	
	private static final Logger log = LoggerFactory.getLogger(CommonQueryServiceImpl.class);

	@Resource
	private BaseDAO<FreeSubject> freesubjectDAO;
	
	@Resource
	private BaseDAO<FreeSchool> freeschoolDAO;
	
	@Resource
	private BaseDAO<FreeMajor> freemajorDAO;
	
	@Resource
	private BaseDAO<FreeMajors50> freemajors50DAO;
	
	@Resource
	private BaseDAO<FreeMajors100> freemajors100DAO;
	
	@Resource
	private BaseDAO<FreeMajors150> freemajors150DAO;
	
	@Resource
	private BaseDAO<FreeMajors200> freemajors200DAO;
	
	@Resource
	private BaseDAO<FreeMajors250> freemajors250DAO;
	
	@Resource
	private BaseDAO<FreeMajors300> freemajors300DAO;
	
	@Resource
	private BaseDAO<FreeMajorsAll> freemajorsAllDAO;
	
	public List<FreeSubject> getSubjectIdList(){
		  return  freesubjectDAO.find("from FreeSubject");
	}
	
	public List<FreeSchool> getSchoolIdList(){
		  return  freeschoolDAO.find("from FreeSchool");
	}
	
	
	public List<FreeMajor> getMajorIdList(){
		  return  freemajorDAO.find("from FreeMajor");
	}
	
	public List<FreeMajor> getMajorIdListByOpenSession(){
		return  freemajorDAO.findByOpenSession("from FreeMajor");
	}
	
	public List<FreeMajors50> getMajors50IdList(){
		  return  freemajors50DAO.find("from FreeMajors50");
	}
	
	public List<FreeMajors100> getMajors100IdList(){
		  return  freemajors100DAO.find("from FreeMajors100");
	}
	
	public List<FreeMajors150> getMajors150IdList(){
		  return  freemajors150DAO.find("from FreeMajors150");
	}
	
	public List<FreeMajors200> getMajors200IdList(){
		  return  freemajors200DAO.find("from FreeMajors200");
	}
	
	public List<FreeMajors250> getMajors250IdList(){
		  return  freemajors250DAO.find("from FreeMajors250");
	}
	
	public List<FreeMajors300> getMajors300IdList(){
		  return  freemajors300DAO.find("from FreeMajors300");
	}
	
	public List<FreeMajorsAll> getMajorsAllIdList(){
		  return  freemajorsAllDAO.find("from FreeMajorsAll");
	}

	public  List<CommonOptionalResult> OptionalCommon(CommonOptional commonOptional) {
		
		
		String major = commonOptional.getMajor();
		String school = commonOptional.getSchool();
		String subject = commonOptional.getSubject();
		
		String subject1;
		String subject2;
		String subject3;
		List<CommonOptionalResult> listResult = new ArrayList<CommonOptionalResult>();
		CommonOptionalResult  resultDo = new CommonOptionalResult();
		CommonOptionalResult  resultDo1 = new CommonOptionalResult();
		CommonOptionalResult  resultDo2 = new CommonOptionalResult();
		//=========================判断选择的全国排行名，并取出结果======================================
		//结果重复，位子没对齐
		if(school.equals("50")) {
	       List<FreeMajors50> FreeMajors = freemajors50DAO.find("from  FreeMajors"+school+" where subject1 NOT LIKE '"+subject+"' AND subject2 NOT LIKE '"+subject+"' AND subject3 NOT LIKE '"+subject+"'   order by major"+major+"  desc  ");
	       if(FreeMajors!=null && FreeMajors.size()>0){
	    	   subject1 = FreeMajors.get(0).getSubject1();
	    	   subject2 = FreeMajors.get(0).getSubject2();
	    	   subject3 = FreeMajors.get(0).getSubject3();
		       resultDo.setSubject1(subject1);
		       resultDo.setSubject2(subject2);
		       resultDo.setSubject3(subject3);
		       resultDo.setId(1);
		       listResult.add(resultDo);
		       subject1 = FreeMajors.get(1).getSubject1();
	    	   subject2 = FreeMajors.get(1).getSubject2();
	    	   subject3 = FreeMajors.get(1).getSubject3();
		       resultDo1.setSubject1(subject1);
		       resultDo1.setSubject2(subject2);
		       resultDo1.setSubject3(subject3);
		       resultDo1.setId(2);
		       listResult.add(resultDo1);
		       subject1 = FreeMajors.get(2).getSubject1();
	    	   subject2 = FreeMajors.get(2).getSubject2();
	    	   subject3 = FreeMajors.get(2).getSubject3();
		       resultDo2.setSubject1(subject1);
		       resultDo2.setSubject2(subject2);
		       resultDo2.setSubject3(subject3);
		       resultDo2.setId(3);
		       listResult.add(resultDo2);
		       
	       }
		}
		else if(school.equals("100")) {
		       List<FreeMajors100> FreeMajors = freemajors100DAO.find("from  FreeMajors"+school+" where subject1 NOT LIKE '"+subject+"' AND subject2 NOT LIKE '"+subject+"' AND subject3 NOT LIKE '"+subject+"'   order by major"+major+"  desc  ");
		       if(FreeMajors!=null && FreeMajors.size()>0){
		    	   subject1 = FreeMajors.get(0).getSubject1();
		    	   subject2 = FreeMajors.get(0).getSubject2();
		    	   subject3 = FreeMajors.get(0).getSubject3();
			       resultDo.setSubject1(subject1);
			       resultDo.setSubject2(subject2);
			       resultDo.setSubject3(subject3);
			       resultDo.setId(1);
			       listResult.add(resultDo);
			       subject1 = FreeMajors.get(1).getSubject1();
		    	   subject2 = FreeMajors.get(1).getSubject2();
		    	   subject3 = FreeMajors.get(1).getSubject3();
			       resultDo1.setSubject1(subject1);
			       resultDo1.setSubject2(subject2);
			       resultDo1.setSubject3(subject3);
			       resultDo1.setId(2);
			       listResult.add(resultDo1);
			       subject1 = FreeMajors.get(2).getSubject1();
		    	   subject2 = FreeMajors.get(2).getSubject2();
		    	   subject3 = FreeMajors.get(2).getSubject3();
			       resultDo2.setSubject1(subject1);
			       resultDo2.setSubject2(subject2);
			       resultDo2.setSubject3(subject3);
			       resultDo2.setId(3);
			       listResult.add(resultDo2);
			       
		       }	
		}
		else if(school.equals("150")) {
		       List<FreeMajors150> FreeMajors = freemajors150DAO.find("from  FreeMajors"+school+" where subject1 NOT LIKE '"+subject+"' AND subject2 NOT LIKE '"+subject+"' AND subject3 NOT LIKE '"+subject+"'   order by major"+major+"  desc  ");
		       if(FreeMajors!=null && FreeMajors.size()>0){
		    	   subject1 = FreeMajors.get(0).getSubject1();
		    	   subject2 = FreeMajors.get(0).getSubject2();
		    	   subject3 = FreeMajors.get(0).getSubject3();
			       resultDo.setSubject1(subject1);
			       resultDo.setSubject2(subject2);
			       resultDo.setSubject3(subject3);
			       resultDo.setId(1);
			       listResult.add(resultDo);
			       subject1 = FreeMajors.get(1).getSubject1();
		    	   subject2 = FreeMajors.get(1).getSubject2();
		    	   subject3 = FreeMajors.get(1).getSubject3();
			       resultDo1.setSubject1(subject1);
			       resultDo1.setSubject2(subject2);
			       resultDo1.setSubject3(subject3);
			       resultDo1.setId(2);
			       listResult.add(resultDo1);
			       subject1 = FreeMajors.get(2).getSubject1();
		    	   subject2 = FreeMajors.get(2).getSubject2();
		    	   subject3 = FreeMajors.get(2).getSubject3();
			       resultDo2.setSubject1(subject1);
			       resultDo2.setSubject2(subject2);
			       resultDo2.setSubject3(subject3);
			       resultDo2.setId(3);
			       listResult.add(resultDo2);
		       }	
		}
		else if(school.equals("200")) {
		       List<FreeMajors200> FreeMajors = freemajors200DAO.find("from  FreeMajors"+school+" where subject1 NOT LIKE '"+subject+"' AND subject2 NOT LIKE '"+subject+"' AND subject3 NOT LIKE '"+subject+"'   order by major"+major+"  desc  ");
		       if(FreeMajors!=null && FreeMajors.size()>0){
		    	   subject1 = FreeMajors.get(0).getSubject1();
		    	   subject2 = FreeMajors.get(0).getSubject2();
		    	   subject3 = FreeMajors.get(0).getSubject3();
			       resultDo.setSubject1(subject1);
			       resultDo.setSubject2(subject2);
			       resultDo.setSubject3(subject3);
			       resultDo.setId(1);
			       listResult.add(resultDo);
			       subject1 = FreeMajors.get(1).getSubject1();
		    	   subject2 = FreeMajors.get(1).getSubject2();
		    	   subject3 = FreeMajors.get(1).getSubject3();
			       resultDo1.setSubject1(subject1);
			       resultDo1.setSubject2(subject2);
			       resultDo1.setSubject3(subject3);
			       resultDo1.setId(2);
			       listResult.add(resultDo1);
			       subject1 = FreeMajors.get(2).getSubject1();
		    	   subject2 = FreeMajors.get(2).getSubject2();
		    	   subject3 = FreeMajors.get(2).getSubject3();
			       resultDo2.setSubject1(subject1);
			       resultDo2.setSubject2(subject2);
			       resultDo2.setSubject3(subject3);
			       resultDo2.setId(3);
			       listResult.add(resultDo2);
		       }	
		}
		else if(school.equals("250")) {
		       List<FreeMajors250> FreeMajors = freemajors250DAO.find("from  FreeMajors"+school+" where subject1 NOT LIKE '"+subject+"' AND subject2 NOT LIKE '"+subject+"' AND subject3 NOT LIKE '"+subject+"'   order by major"+major+"  desc  ");
		       if(FreeMajors!=null && FreeMajors.size()>0){
		    	   subject1 = FreeMajors.get(0).getSubject1();
		    	   subject2 = FreeMajors.get(0).getSubject2();
		    	   subject3 = FreeMajors.get(0).getSubject3();
			       resultDo.setSubject1(subject1);
			       resultDo.setSubject2(subject2);
			       resultDo.setSubject3(subject3);
			       resultDo.setId(1);
			       listResult.add(resultDo);
			       subject1 = FreeMajors.get(1).getSubject1();
		    	   subject2 = FreeMajors.get(1).getSubject2();
		    	   subject3 = FreeMajors.get(1).getSubject3();
			       resultDo1.setSubject1(subject1);
			       resultDo1.setSubject2(subject2);
			       resultDo1.setSubject3(subject3);
			       resultDo1.setId(2);
			       listResult.add(resultDo1);
			       subject1 = FreeMajors.get(2).getSubject1();
		    	   subject2 = FreeMajors.get(2).getSubject2();
		    	   subject3 = FreeMajors.get(2).getSubject3();
			       resultDo2.setSubject1(subject1);
			       resultDo2.setSubject2(subject2);
			       resultDo2.setSubject3(subject3);
			       resultDo2.setId(3);
			       listResult.add(resultDo2);
		       }	
		}
		else if(school.equals("300")) {
		       List<FreeMajors300> FreeMajors = freemajors300DAO.find("from  FreeMajors"+school+" where subject1 NOT LIKE '"+subject+"' AND subject2 NOT LIKE '"+subject+"' AND subject3 NOT LIKE '"+subject+"'   order by major"+major+"  desc  ");
		       if(FreeMajors!=null && FreeMajors.size()>0){
		    	   subject1 = FreeMajors.get(0).getSubject1();
		    	   subject2 = FreeMajors.get(0).getSubject2();
		    	   subject3 = FreeMajors.get(0).getSubject3();
			       resultDo.setSubject1(subject1);
			       resultDo.setSubject2(subject2);
			       resultDo.setSubject3(subject3);
			       resultDo.setId(1);
			       listResult.add(resultDo);
			       subject1 = FreeMajors.get(1).getSubject1();
		    	   subject2 = FreeMajors.get(1).getSubject2();
		    	   subject3 = FreeMajors.get(1).getSubject3();
			       resultDo1.setSubject1(subject1);
			       resultDo1.setSubject2(subject2);
			       resultDo1.setSubject3(subject3);
			       resultDo1.setId(2);
			       listResult.add(resultDo1);
			       subject1 = FreeMajors.get(2).getSubject1();
		    	   subject2 = FreeMajors.get(2).getSubject2();
		    	   subject3 = FreeMajors.get(2).getSubject3();
			       resultDo2.setSubject1(subject1);
			       resultDo2.setSubject2(subject2);
			       resultDo2.setSubject3(subject3);
			       resultDo2.setId(3);
			       listResult.add(resultDo2);
		       }	
		}
		else {
		       List<FreeMajorsAll> FreeMajors = freemajorsAllDAO.find("from  FreeMajorsAll where subject1 NOT LIKE '"+subject+"' AND subject2 NOT LIKE '"+subject+"' AND subject3 NOT LIKE '"+subject+"'   order by major"+major+"  desc  ");
		       if(FreeMajors!=null && FreeMajors.size()>0){
		    	   subject1 = FreeMajors.get(0).getSubject1();
		    	   subject2 = FreeMajors.get(0).getSubject2();
		    	   subject3 = FreeMajors.get(0).getSubject3();
			       resultDo.setSubject1(subject1);
			       resultDo.setSubject2(subject2);
			       resultDo.setSubject3(subject3);
			       resultDo.setId(1);
			       listResult.add(resultDo);
			       subject1 = FreeMajors.get(1).getSubject1();
		    	   subject2 = FreeMajors.get(1).getSubject2();
		    	   subject3 = FreeMajors.get(1).getSubject3();
			       resultDo1.setSubject1(subject1);
			       resultDo1.setSubject2(subject2);
			       resultDo1.setSubject3(subject3);
			       resultDo1.setId(2);
			       listResult.add(resultDo1);
			       subject1 = FreeMajors.get(2).getSubject1();
		    	   subject2 = FreeMajors.get(2).getSubject2();
		    	   subject3 = FreeMajors.get(2).getSubject3();
			       resultDo2.setSubject1(subject1);
			       resultDo2.setSubject2(subject2);
			       resultDo2.setSubject3(subject3);
			       resultDo2.setId(3);
			       listResult.add(resultDo2);
		       }
		}   
		return listResult;
	}

	

	
	


}