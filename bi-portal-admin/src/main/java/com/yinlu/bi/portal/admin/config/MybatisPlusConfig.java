package com.yinlu.bi.portal.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yinlu.bi.portal.*.mapper")
public class MybatisPlusConfig {

}
