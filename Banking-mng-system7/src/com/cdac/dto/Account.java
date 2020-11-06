package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account2")
public class Account {

	@Id
	@GeneratedValue
	@Column(name = "account_Id")
	private int accountId;
	@Column(name = "account_No")
	private int accountNo;
	@Column(name = "f_Name")
	private String fName;
	@Column(name = "l_Name")
	private String lName;
	@Column(name = "date")
	private String date;
	@Column(name = "gender")
	private String gender;
	@Column(name = "dateOfBirth")
	private String dateOfBirth;
	
	private int userId;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountId, String fName, String lName, String date, String dateOfBirth, int userId) {
		super();
		this.accountId = accountId;
		this.fName = fName;
		this.lName = lName;
		this.date = date;
		this.dateOfBirth = dateOfBirth;
		this.userId = userId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
    
	
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", fName=" + fName + ", lName=" + lName + ", date=" + date
				+ ", dateOfBirth=" + dateOfBirth + ", userId=" + userId + "]";
	}
	
	

}
