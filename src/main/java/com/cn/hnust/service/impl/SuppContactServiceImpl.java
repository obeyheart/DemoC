package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.SuppContactDao;
import com.cn.hnust.pojo.NewSuppContact;
import com.cn.hnust.pojo.SuppContact;
import com.cn.hnust.service.SuppContactService;

@Service("contactService")
public class SuppContactServiceImpl implements SuppContactService{

	@Resource
	private SuppContactDao contactDao;

	public List<NewSuppContact> findContactsByCustomer_id(int id) {
		List<NewSuppContact> listNewC = contactDao.findContactsByCustomer_id(id);
		return listNewC;
	}

	public int countContactsByCustomer_id(int id) {
		int num = contactDao.countContactsByCustomer_id(id);
		return num;
	}

	public NewSuppContact findBySupp_contact_id(int contact_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int selectRoleIdByRoleName(String supp_role_name) {
		int num = contactDao.selectRoleIdByRoleName(supp_role_name);
		return num;
	}

	public void updateContactBySupp_contact(SuppContact cont) {
		contactDao.updateContactBySupp_contact(cont);
	}

	public int insertContactBySequence(SuppContact cont) {
		contactDao.insertContactBySequence(cont);
		int num = cont.getSuppContactId();
		return num;
	}

	public void deleteContactBySupp_contact_id(int contact_id) {
		contactDao.deleteContactBySupp_contact_id(contact_id);
	}


}
