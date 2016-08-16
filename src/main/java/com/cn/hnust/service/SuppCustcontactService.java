package com.cn.hnust.service;

import com.cn.hnust.pojo.SuppCustContact;

public interface SuppCustcontactService {
	public void deleteCustcontact(SuppCustContact cc);
	
	public void deleteCustcontactByCustid(int id);
	
	public void insertCustcontact(SuppCustContact cc);
}
