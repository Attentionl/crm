package com.sxdx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author 李今朝
 * @date 2020-02-05T19:30:58+08:00
 */
@SpringBootApplication
@MapperScan(basePackages = "com.sxdx.basic.mapper")
public class CrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }

}
