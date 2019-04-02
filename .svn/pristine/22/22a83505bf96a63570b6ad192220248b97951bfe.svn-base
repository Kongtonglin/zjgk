package com.zjgk.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SchoolRankJjx extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String school;

	private int rank;

	private int majorLevel;

	private int schoolCode;
 

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getMajorLevel() {
		return majorLevel;
	}

	public void setMajorLevel(int majorLevel) {
		this.majorLevel = majorLevel;
	}

	public int getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
	}

}
