package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.NewSuppUser;
import com.cn.hnust.selectCondition.UserCondition;

public interface SuppUserService {
	public NewSuppUser getUserByNickname(String suppUserNickname);
	
	public List<NewSuppUser> getUserByCondition(UserCondition condition);
	
}

