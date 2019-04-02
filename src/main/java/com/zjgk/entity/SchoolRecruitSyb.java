package com.zjgk.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SchoolRecruitSyb extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String school;

	private String code1; //未知用处

	private String majorDetail;//专业名称
	
	private String xyz; // X, Y,Z
	
	private String code2; //排序？？？

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getMajorDetail() {
		return majorDetail;
	}

	public void setMajorDetail(String majorDetail) {
		this.majorDetail = majorDetail;
	}

	public String getXyz() {
		return xyz;
	}

	public void setXyz(String xyz) {
		this.xyz = xyz;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

}
