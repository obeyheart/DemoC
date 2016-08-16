package com.cn.hnust.dao;

import org.springframework.stereotype.Repository;

import com.cn.hnust.pojo.SuppCustContact;

@Repository
public interface SuppCustcontactDao {
	void deleteCustcontact(SuppCustContact cc);
	
	void deleteCustcontactByCustid(int id);
	
	void insertCustcontact(SuppCustContact cc);
}
