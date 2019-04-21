package com.yidiandian;

import com.yidiandian.entity.UserInfo;
import com.yidiandian.service.UserInfoApi;
import com.yidiandian.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerApplicationTests {

    @Autowired
    UserInfoService userInfoService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void query(){
        UserInfo userInfo = userInfoService.queryUserInfo( "123" );
        System.out.println("得到的数据："+userInfo.toString());
    }

}
