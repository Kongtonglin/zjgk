package com.zjgk.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Sign extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String school;
	
	private String grade;

	private String student1;
	
	private String student2;
	
	private String student3;
	
	private String teacher;

	public String getSchool() {
		return school;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}

	public String getStudent1() {
		return student1;
	}

	public void setStudent1(String student1) {
		this.student1 = student1;
	}

	public String getStudent2() {
		return student2;
	}

	public void setStudent2(String student2) {
		this.student2 = student2;
	}

	public String getStudent3() {
		return student3;
	}

	public void setStudent3(String student3) {
		this.student3 = student3;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


 
}
