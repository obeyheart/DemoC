package com.cn.hnust.dao;

import org.springframework.stereotype.Repository;

import com.cn.hnust.pojo.UserT;

@Repository
public interface IUserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(UserT record);

    int insertSelective(UserT record);

    UserT selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserT record);

    int updateByPrimaryKey(UserT record);
}