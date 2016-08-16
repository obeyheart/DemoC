package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.SuppCustomerDao;
import com.cn.hnust.pojo.SuppCustomer;
import com.cn.hnust.selectCondition.CustomerCondition;
import com.cn.hnust.service.SuppCustomerService;

@Service("customerService")
public class SuppCustomerServiceImpl implements SuppCustomerService{

	@Resource
	private SuppCustomerDao customerDao;
	
	public SuppCustomer findBySupp_customer_id(int id) {
		SuppCustomer customer = customerDao.findBySupp_customer_id(id);
		return customer;
	}

	public List<SuppCustomer> findCustomersByCondition(CustomerCondition condition) {
		List<SuppCustomer> list = customerDao.findCustomersByCondition(condition);
		return list;
	}

	public int countCustomersByCondition(CustomerCondition condition) {
		int num = customerDao.countCustomersByCondition(condition);
		return num;
	}

	public void deleteCustomerBySupp_customer_id(int id) {
		customerDao.deleteCustomerBySupp_customer_id(id);
	}

	public void updateCustomerBySupp_customer(SuppCustomer customer) {
		customerDao.updateCustomerBySupp_customer(customer);
	}

	public int insertCustomerBySequence(SuppCustomer customer) {
		customerDao.insertCustomerBySequence(customer);
		int num = customer.getSuppCustomerId();
		return num;
	}

}
