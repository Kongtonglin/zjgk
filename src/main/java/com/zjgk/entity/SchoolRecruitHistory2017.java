package com.zjgk.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SchoolRecruitHistory2017 extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String school;
	
	private String majorDetail; //专业名称

	private String majorCode; //分类代码
	
	private String  dl;// 大类代码
	
	private int  persons;//录取人数
	
	private int  avgScore;//平均分
	
	private int  lowScore;//平均分
	
	private int batch;
	
	private int year;
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajorDetail() {
		return majorDetail;
	}

	public void setMajorDetail(String majorDetail) {
		this.majorDetail = majorDetail;
	}

	public String getMajorCode() {
		return majorCode;
	}

	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}

	

	public String getDl() {
		return dl;
	}

	public void setDl(String dl) {
		this.dl = dl;
	}

	public int getPersons() {
		return persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}

	public int getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(int avgScore) {
		this.avgScore = avgScore;
	}

	public int getLowScore() {
		return lowScore;
	}

	public void setLowScore(int lowScore) {
		this.lowScore = lowScore;
	}

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

	
}
