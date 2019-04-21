package com.yidiandian;

import com.yidiandian.dao.UserInfoDao;
import com.yidiandian.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboProviderApplicationTests {

    @Autowired
    UserInfoDao userInfoDao;

    @Test
    public void contextLoads() {
      UserInfo userInfo =  userInfoDao.findByUserId( null );

        System.out.println("user:"+userInfo.toString());
    }

}
