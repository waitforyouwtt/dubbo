package com.yidiandian.service;

import com.yidiandian.entity.UserInfo;

/**
 * @Author: 一点点
 * @Date: 2019/4/21 14:32
 * @Version 1.0
 */
public interface UserInfoApi {

    UserInfo save(UserInfo userInfo);

    UserInfo findByUserId(String userId);

    UserInfo update(UserInfo userInfo);


}
