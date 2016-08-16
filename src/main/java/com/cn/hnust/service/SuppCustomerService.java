package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.SuppCustomer;
import com.cn.hnust.selectCondition.CustomerCondition;

public interface SuppCustomerService {
	public SuppCustomer findBySupp_customer_id(int id);
	
	public List<SuppCustomer> findCustomersByCondition(CustomerCondition condition);
	
	public int countCustomersByCondition(CustomerCondition condition);
	
	public void deleteCustomerBySupp_customer_id(int id);
	
	public void updateCustomerBySupp_customer(SuppCustomer customer);
	
	public int insertCustomerBySequence(SuppCustomer customer);
}
