package com.sxdx.basic.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 李今朝
 * @className MybatisConfig
 * @version1.0
 * @description
 * @createdTime 2020/2/12 22:40
 */
@Configuration
@MapperScan(basePackages = "com.sxdx.basic.mapper")
public class MybatisConfig {
}
