package com.zjgk.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class School extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String school;
	
	private int schoolCode;
	
	private String net;

	private Province province;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name="province_id", insertable = false, updatable = false)  
	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public int getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}
}
