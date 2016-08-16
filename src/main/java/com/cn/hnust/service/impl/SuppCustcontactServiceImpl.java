package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.SuppCustcontactDao;
import com.cn.hnust.pojo.SuppCustContact;
import com.cn.hnust.service.SuppCustcontactService;

@Service("custcontactService")
public class SuppCustcontactServiceImpl implements SuppCustcontactService {

	@Resource
	private SuppCustcontactDao ustcontactDao;

	public void deleteCustcontact(SuppCustContact cc) {
		ustcontactDao.deleteCustcontact(cc);
	}

	public void deleteCustcontactByCustid(int id) {
		ustcontactDao.deleteCustcontactByCustid(id);
	}

	public void insertCustcontact(SuppCustContact cc) {
		ustcontactDao.insertCustcontact(cc);
	}

}
