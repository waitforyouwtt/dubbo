package com.yidiandian.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yidiandian.dao.UserInfoDao;
import com.yidiandian.entity.UserInfo;
import com.yidiandian.service.UserInfoApi;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: 一点点
 * @Date: 2019/4/21 14:38
 * @Version 1.0
 */
@Service
public class UserInfoApiImpl implements UserInfoApi {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo save(UserInfo userInfo) {
        return userInfoDao.save(userInfo);
    }

    @Override
    public UserInfo findByUserId(String userId) {
        return userInfoDao.findByUserId( userId );
    }

    @Override
    public UserInfo update(UserInfo userInfo) {
        return userInfoDao.update( userInfo );
    }
}
