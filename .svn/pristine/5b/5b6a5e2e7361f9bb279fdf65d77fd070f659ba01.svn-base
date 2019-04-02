package com.zjgk.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.zjgk.DO.enumDO.Subjects;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;


	private String userName;
	private String password;
	private String email;
	private String realName;
	private String phone;
	private String cellphone;
	private String cellphonecode;
	private String sex;
	private String qq;
	private String weChat;
	private Long district;
	//准考证号
	private String  passNo;
	// 默认isLocked为false
	private Boolean isLocked = false;
	private String comment;
	// 客户等级
	private String level;
	
	private Date regDate;
	
	private int rank;
	 
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWeChat() {
		return weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	public Long getDistrict() {
		return district;
	}

	public void setDistrict(Long district) {
		this.district = district;
	}
 

	public String getPassNo() {
		return passNo;
	}

	public void setPassNo(String passNo) {
		this.passNo = passNo;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getCellphonecode() {
		return cellphonecode;
	}

	public void setCellphonecode(String cellphonecode) {
		this.cellphonecode = cellphonecode;
	}
	

}
