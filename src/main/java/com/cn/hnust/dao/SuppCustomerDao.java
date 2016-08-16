package com.cn.hnust.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.hnust.pojo.SuppCustomer;
import com.cn.hnust.selectCondition.CustomerCondition;

@Repository
public interface SuppCustomerDao {
	SuppCustomer findBySupp_customer_id(int id);
	
	List<SuppCustomer> findCustomersByCondition(CustomerCondition condition);
	
	int countCustomersByCondition(CustomerCondition condition);
	
	void deleteCustomerBySupp_customer_id(int id);
	
	void updateCustomerBySupp_customer(SuppCustomer customer);
	
	int insertCustomerBySequence(SuppCustomer customer);
}
