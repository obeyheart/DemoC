package com.cn.hnust.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.hnust.pojo.NewSuppUser;
import com.cn.hnust.pojo.SuppUser;
import com.cn.hnust.selectCondition.UserCondition;

@Repository
public interface SuppUserDao {
	NewSuppUser findBySupp_user_nickname(String suppUserNickname);
	
	List<NewSuppUser> findUsersByCondition(UserCondition condition);
	
	int countUsersByCondition(UserCondition condition);
	
	void deleteUserBySupp_user_nickname(String suppUserNickname);
	
	void updateUserByUser(SuppUser user);
	
	void insertUserByUser(SuppUser user);
}
