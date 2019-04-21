package com.yidiandian.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yidiandian.entity.UserInfo;
import com.yidiandian.service.UserInfoApi;
import com.yidiandian.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * @Author: 一点点
 * @Date: 2019/4/21 15:47
 * @Version 1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Reference
    UserInfoApi userInfoApi;

    @Override
    public UserInfo queryUserInfo(String userId) {
        return userInfoApi.findByUserId(userId);
    }
}
