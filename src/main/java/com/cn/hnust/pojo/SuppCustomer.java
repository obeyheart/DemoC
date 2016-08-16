package com.cn.hnust.pojo;

import java.util.Date;

public class SuppCustomer {
	private int suppCustomerId;
	private String suppCustomerSupptype;
	private String suppCustomerCompany;
	private String suppCustomerChargePerson;
	private String suppCustomerIssign;
	private String suppCustomerSigntime;
	private String suppCustomerIsproduct;
	private String suppCustomerStatus;
	private String suppCustomerRegisterCapital;
	
	public SuppCustomer() {
		// TODO Auto-generated constructor stub
	}
	
	public SuppCustomer(int suppCustomerId, String suppCustomerSupptype,
			String suppCustomerCompany, String suppCustomerChargePerson,
			String suppCustomerIssign, String suppCustomerSigntime,
			String suppCustomerIsproduct, String suppCustomerStatus,
			String suppCustomerRegisterCapital) {
		this.suppCustomerId = suppCustomerId;
		this.suppCustomerSupptype = suppCustomerSupptype;
		this.suppCustomerCompany = suppCustomerCompany;
		this.suppCustomerChargePerson = suppCustomerChargePerson;
		this.suppCustomerIssign = suppCustomerIssign;
		this.suppCustomerSigntime = suppCustomerSigntime;
		this.suppCustomerIsproduct = suppCustomerIsproduct;
		this.suppCustomerStatus = suppCustomerStatus;
		this.suppCustomerRegisterCapital = suppCustomerRegisterCapital;
	}
	
	public int getSuppCustomerId() {
		return suppCustomerId;
	}
	public void setSuppCustomerId(int suppCustomerId) {
		this.suppCustomerId = suppCustomerId;
	}
	public String getSuppCustomerSupptype() {
		return suppCustomerSupptype;
	}
	public void setSuppCustomerSupptype(String suppCustomerSupptype) {
		this.suppCustomerSupptype = suppCustomerSupptype;
	}
	public String getSuppCustomerCompany() {
		return suppCustomerCompany;
	}
	public void setSuppCustomerCompany(String suppCustomerCompany) {
		this.suppCustomerCompany = suppCustomerCompany;
	}
	public String getSuppCustomerChargePerson() {
		return suppCustomerChargePerson;
	}
	public void setSuppCustomerChargePerson(String suppCustomerChargePerson) {
		this.suppCustomerChargePerson = suppCustomerChargePerson;
	}
	public String getSuppCustomerIssign() {
		return suppCustomerIssign;
	}
	public void setSuppCustomerIssign(String suppCustomerIssign) {
		this.suppCustomerIssign = suppCustomerIssign;
	}
	public String getSuppCustomerSigntime() {
		return suppCustomerSigntime;
	}
	public void setSuppCustomerSigntime(String suppCustomerSigntime) {
		this.suppCustomerSigntime = suppCustomerSigntime;
	}
	public String getSuppCustomerIsproduct() {
		return suppCustomerIsproduct;
	}
	public void setSuppCustomerIsproduct(String suppCustomerIsproduct) {
		this.suppCustomerIsproduct = suppCustomerIsproduct;
	}
	public String getSuppCustomerStatus() {
		return suppCustomerStatus;
	}
	public void setSuppCustomerStatus(String suppCustomerStatus) {
		this.suppCustomerStatus = suppCustomerStatus;
	}
	public String getSuppCustomerRegisterCapital() {
		return suppCustomerRegisterCapital;
	}
	public void setSuppCustomerRegisterCapital(String suppCustomerRegisterCapital) {
		this.suppCustomerRegisterCapital = suppCustomerRegisterCapital;
	}
	@Override
	public String toString() {
		return "SuppCustomer [suppCustomerId=" + suppCustomerId
				+ ", suppCustomerSupptype=" + suppCustomerSupptype
				+ ", suppCustomerCompany=" + suppCustomerCompany
				+ ", suppCustomerChargePerson=" + suppCustomerChargePerson
				+ ", suppCustomerIssign=" + suppCustomerIssign
				+ ", suppCustomerSigntime=" + suppCustomerSigntime
				+ ", suppCustomerIsproduct=" + suppCustomerIsproduct
				+ ", suppCustomerStatus=" + suppCustomerStatus
				+ ", suppCustomerRegisterCapital="
				+ suppCustomerRegisterCapital + "]";
	}
	
	
}
