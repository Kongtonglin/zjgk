package com.zjgk.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SchoolRecruitDl extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String school;

	private String dl;

	private String majorDetail;//专业名称

	private int dlCode;
	
	private String  majorCode;//分类代码
	
	private String majorClassify;//分类名称
 
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDl() {
		return dl;
	}

	public void setDl(String dl) {
		this.dl = dl;
	}

	public String getMajorDetail() {
		return majorDetail;
	}

	public void setMajorDetail(String majorDetail) {
		this.majorDetail = majorDetail;
	}

	public int getDlCode() {
		return dlCode;
	}

	public void setDlCode(int dlCode) {
		this.dlCode = dlCode;
	}

	public String getMajorCode() {
		return majorCode;
	}

	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}

	public String getMajorClassify() {
		return majorClassify;
	}

	public void setMajorClassify(String majorClassify) {
		this.majorClassify = majorClassify;
	}

}
