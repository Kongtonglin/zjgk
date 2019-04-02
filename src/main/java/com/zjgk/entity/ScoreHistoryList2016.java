package com.zjgk.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ScoreHistoryList2016 extends BaseEntity implements Serializable {
	/**
	 * 一分一段数据表
	 */

	private static final long serialVersionUID = 1L;

	private int  year;

	private int wl; //文科or理科

	private int score;//分数
	
	private int  persons; // 人数
	
	private int rank; //排名

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	} 

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getPersons() {
		return persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getWl() {
		return wl;
	}

	public void setWl(int wl) {
		this.wl = wl;
	}
 
}
