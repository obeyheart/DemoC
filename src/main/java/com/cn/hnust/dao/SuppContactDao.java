package com.cn.hnust.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.hnust.pojo.NewSuppContact;
import com.cn.hnust.pojo.SuppContact;
import com.cn.hnust.pojo.SuppUser;
import com.cn.hnust.selectCondition.ContactCondition;

@Repository
public interface SuppContactDao {
	NewSuppContact findBySupp_contact_id(int id);
	
	List<NewSuppContact> findContactsByCustomer_id(int id);
	
	int countContactsByCustomer_id(int id);
	
	void deleteContactBySupp_contact_id(int id);
	
	void updateContactBySupp_contact(SuppContact contact);
	
	int insertContactBySequence(SuppContact contact);
	
	int selectRoleIdByRoleName(String roleName);
}
