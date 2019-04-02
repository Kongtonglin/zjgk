package com.zjgk.service;

import java.util.List;

import com.zjgk.DO.CommonOptional;
import com.zjgk.DO.CommonOptionalResult;
import com.zjgk.DO.CommonQueryDO;
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
import com.zjgk.entity.User;


public interface OptionalService {
	
	public List<FreeSubject> getSubjectIdList();
	
	public List<FreeSchool> getSchoolIdList();
	
	public List<FreeMajor> getMajorIdList();
	 //for init data 
	public List<FreeMajor> getMajorIdListByOpenSession();

	public List<FreeMajors50> getMajors50IdList();
	
	public List<FreeMajors100> getMajors100IdList();

	public List<FreeMajors150> getMajors150IdList();

	public List<FreeMajors200> getMajors200IdList();

	public List<FreeMajors250> getMajors250IdList();

	public List<FreeMajors300> getMajors300IdList();

	public List<FreeMajorsAll> getMajorsAllIdList();

	public List<CommonOptionalResult> OptionalCommon( CommonOptional commonOptional);
	
}
