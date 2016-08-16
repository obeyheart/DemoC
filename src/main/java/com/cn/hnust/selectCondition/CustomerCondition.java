package com.cn.hnust.selectCondition;

public class CustomerCondition {
	private String suppCustomerCompany;
	private String suppCustomerChargeperson;
	private String suppCustomerIssign;
	private String suppCustomerStatus;
	private String suppCustomerSupptype;
	
	public CustomerCondition() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerCondition(String suppCustomerCompany,
			String suppCustomerChargeperson, String suppCustomerIssign,
			String suppCustomerStatus, String suppCustomerSupptype) {
		this.suppCustomerCompany = suppCustomerCompany;
		this.suppCustomerChargeperson = suppCustomerChargeperson;
		this.suppCustomerIssign = suppCustomerIssign;
		this.suppCustomerStatus = suppCustomerStatus;
		this.suppCustomerSupptype = suppCustomerSupptype;
	}
	
	public String getSuppCustomerCompany() {
		return suppCustomerCompany;
	}
	public void setSuppCustomerCompany(String suppCustomerCompany) {
		this.suppCustomerCompany = suppCustomerCompany;
	}
	public String getSuppCustomerChargeperson() {
		return suppCustomerChargeperson;
	}
	public void setSuppCustomerChargeperson(String suppCustomerChargeperson) {
		this.suppCustomerChargeperson = suppCustomerChargeperson;
	}
	public String getSuppCustomerIssign() {
		return suppCustomerIssign;
	}
	public void setSuppCustomerIssign(String suppCustomerIssign) {
		this.suppCustomerIssign = suppCustomerIssign;
	}
	public String getSuppCustomerStatus() {
		return suppCustomerStatus;
	}
	public void setSuppCustomerStatus(String suppCustomerStatus) {
		this.suppCustomerStatus = suppCustomerStatus;
	}
	public String getSuppCustomerSupptype() {
		return suppCustomerSupptype;
	}
	public void setSuppCustomerSupptype(String suppCustomerSupptype) {
		this.suppCustomerSupptype = suppCustomerSupptype;
	}
	
}
