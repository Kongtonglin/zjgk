package com.zjgk.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FreeMajor extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;



	private String name;



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
