package com.cn.hnust.pojo;

public class SuppContact {
	private int suppContactId;
	private String suppContactName;
	private int suppRoleId;
	private String suppContactDepartposition;
	private String suppContactMobilephone;
	private String suppContactOfficephone;
	private String suppContactEmail;
	private String suppContactFax;
	private String suppContactQQ;
	private String suppContactAddress;
	private String suppContactNote;
	
	public SuppContact() {
		// TODO Auto-generated constructor stub
	}
	
	public SuppContact(int suppContactId, String suppContactName,
			int suppRoleId, String suppContactDepartposition,
			String suppContactMobilephone, String suppContactOfficephone,
			String suppContactEmail, String suppContactFax,
			String suppContactQQ, String suppContactAddress,
			String suppContactNote) {
		this.suppContactId = suppContactId;
		this.suppContactName = suppContactName;
		this.suppRoleId = suppRoleId;
		this.suppContactDepartposition = suppContactDepartposition;
		this.suppContactMobilephone = suppContactMobilephone;
		this.suppContactOfficephone = suppContactOfficephone;
		this.suppContactEmail = suppContactEmail;
		this.suppContactFax = suppContactFax;
		this.suppContactQQ = suppContactQQ;
		this.suppContactAddress = suppContactAddress;
		this.suppContactNote = suppContactNote;
	}
	
	public int getSuppContactId() {
		return suppContactId;
	}
	public void setSuppContactId(int suppContactId) {
		this.suppContactId = suppContactId;
	}
	public String getSuppContactName() {
		return suppContactName;
	}
	public void setSuppContactName(String suppContactName) {
		this.suppContactName = suppContactName;
	}
	public int getSuppRoleId() {
		return suppRoleId;
	}
	public void setSuppRoleId(int suppRoleId) {
		this.suppRoleId = suppRoleId;
	}
	public String getSuppContactDepartposition() {
		return suppContactDepartposition;
	}
	public void setSuppContactDepartposition(String suppContactDepartposition) {
		this.suppContactDepartposition = suppContactDepartposition;
	}
	public String getSuppContactMobilephone() {
		return suppContactMobilephone;
	}
	public void setSuppContactMobilephone(String suppContactMobilephone) {
		this.suppContactMobilephone = suppContactMobilephone;
	}
	public String getSuppContactOfficephone() {
		return suppContactOfficephone;
	}
	public void setSuppContactOfficephone(String suppContactOfficephone) {
		this.suppContactOfficephone = suppContactOfficephone;
	}
	public String getSuppContactEmail() {
		return suppContactEmail;
	}
	public void setSuppContactEmail(String suppContactEmail) {
		this.suppContactEmail = suppContactEmail;
	}
	public String getSuppContactFax() {
		return suppContactFax;
	}
	public void setSuppContactFax(String suppContactFax) {
		this.suppContactFax = suppContactFax;
	}
	public String getSuppContactQQ() {
		return suppContactQQ;
	}
	public void setSuppContactQQ(String suppContactQQ) {
		this.suppContactQQ = suppContactQQ;
	}
	public String getSuppContactAddress() {
		return suppContactAddress;
	}
	public void setSuppContactAddress(String suppContactAddress) {
		this.suppContactAddress = suppContactAddress;
	}
	public String getSuppContactNote() {
		return suppContactNote;
	}
	public void setSuppContactNote(String suppContactNote) {
		this.suppContactNote = suppContactNote;
	}
	@Override
	public String toString() {
		return "Contact [suppContactId=" + suppContactId + ", suppContactName="
				+ suppContactName + ", suppRoleId=" + suppRoleId
				+ ", suppContactDepartposition=" + suppContactDepartposition
				+ ", suppContactMobilephone=" + suppContactMobilephone
				+ ", suppContactOfficephone=" + suppContactOfficephone
				+ ", suppContactEmail=" + suppContactEmail
				+ ", suppContactFax=" + suppContactFax + ", suppContactQQ="
				+ suppContactQQ + ", suppContactAddress=" + suppContactAddress
				+ ", suppContactNote=" + suppContactNote + "]";
	}
	
	
	
	
}
