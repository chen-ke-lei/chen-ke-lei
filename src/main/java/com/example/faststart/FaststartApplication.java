package com.example.faststart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.dao.*","com.example.faststart.*"})
//扫包路径
@ComponentScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.manager.*","com.example.faststart.*"})
public class FaststartApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaststartApplication.class, args);
    }

}
