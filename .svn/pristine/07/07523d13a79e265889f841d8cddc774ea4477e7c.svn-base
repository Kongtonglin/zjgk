package com.zjgk.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.zjgk.DO.enumDO.Subjects;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserScore extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private User user;
	private Subjects subject;
	private String score;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", insertable = true, updatable = false)  
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
  
	public Subjects getSubject() {
		return subject;
	}
	public void setSubject(Subjects subject) {
		this.subject = subject;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	 
}
