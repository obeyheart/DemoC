package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.SuppUserDao;
import com.cn.hnust.pojo.NewSuppUser;
import com.cn.hnust.selectCondition.UserCondition;
import com.cn.hnust.service.SuppUserService;

@Service("suppUserService")
public class SuppUserServiceImpl implements SuppUserService {
	@Resource
	private SuppUserDao suppSerDao;

	public NewSuppUser getUserByNickname(String suppUserNickname) {
		return this.suppSerDao.findBySupp_user_nickname(suppUserNickname);
	}

	public List<NewSuppUser> getUserByCondition(UserCondition condition) {
		return this.suppSerDao.findUsersByCondition(condition);
	}
	
}

