package com.yidiandian;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan({"com.yidiandian.mapper","com.yidiandian.dao"})
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run( DubboProviderApplication.class, args );
    }

}
