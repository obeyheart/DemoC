package com.cn.hnust.service;

import java.util.List;
import java.util.Map;

import com.cn.hnust.pojo.NewSuppContact;
import com.cn.hnust.pojo.SuppContact;
import com.cn.hnust.selectCondition.ContactCondition;

public interface SuppContactService {
	public NewSuppContact findBySupp_contact_id(int id);
	
	public List<NewSuppContact> findContactsByCustomer_id(int id);
	
	public int countContactsByCustomer_id(int id);
	
	public void deleteContactBySupp_contact_id(int id);
	
	public void updateContactBySupp_contact(SuppContact contact);
	
	public int insertContactBySequence(SuppContact contact);
	
	public int selectRoleIdByRoleName(String roleName);
}

