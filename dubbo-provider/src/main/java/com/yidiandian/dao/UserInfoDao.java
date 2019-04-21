package com.yidiandian.dao;

import com.yidiandian.entity.UserInfo;
/**
 * @Author: 一点点
 * @Date: 2019/4/21 14:51
 * @Version 1.0
 */
public interface UserInfoDao {
    UserInfo save(UserInfo userInfo);

    UserInfo findByUserId(String userId);

    UserInfo update(UserInfo userInfo);
}
