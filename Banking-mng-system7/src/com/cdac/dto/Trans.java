package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trans")
public class Trans {

	@Id
	@GeneratedValue
	@Column(name = "Trans_Id")
	private int transId;
	@Column(name = "account_No")
	private int accountNo;
	@Column(name = "Name")
	private String name;
	@Column(name = "Trans_Type")
	private String transType;
	@Column(name = "Amount")
	private String amount;
	@Column(name = "Currnet_Bal")
	private String currentBal;
	@Column(name = "Date")
	private String date;
	private int userId;
	
	public Trans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trans(int transId, String name, String transType, String amount, String currentBal, String date,
			int userId) {
		super();
		this.transId = transId;
		this.name = name;
		this.transType = transType;
		this.amount = amount;
		this.currentBal = currentBal;
		this.date = date;
		this.userId = userId;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrentBal() {
		return currentBal;
	}
	public void setCurrentBal(String currentBal) {
		this.currentBal = currentBal;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	@Override
	public String toString() {
		return "Trans [transId=" + transId + ", accountNo=" + accountNo + ", name=" + name + ", transType=" + transType
				+ ", amount=" + amount + ", currentBal=" + currentBal + ", date=" + date + ", userId=" + userId + "]";
	}
	
	
	
}
