package com.yidiandian.controller;

import com.yidiandian.entity.UserInfo;
import com.yidiandian.service.UserInfoApi;
import com.yidiandian.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 一点点
 * @Date: 2019/4/21 15:42
 * @Version 1.0
 */
@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;
    @GetMapping("/query")
    public String queryUser(){
        String userId = "1";
        UserInfo userInfo = userInfoService.queryUserInfo(userId);
        System.out.println("得到的数据："+userInfo.toString());
        return "hello";
    }


}
