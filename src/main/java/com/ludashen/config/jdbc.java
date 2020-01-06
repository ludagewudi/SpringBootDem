package com.ludashen.config;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2020-01-06 14:00
 */
@Configuration
@PropertySource("classpath:db.properties")
@EnableConfigurationProperties(jdbcProperties.class)
public class jdbc {
//    属性注入
//    @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.driver}")
//    String dr;
//    @Value("${jdbc.username}")
//    String name;
//    @Value("${jdbc.password}")
//    String pass;
//    这个参数是由调用的spring进行传入，对其进行注入
    @Bean
    public DataSource dataSource(jdbcProperties prop) {
        DruidDataSource source=new DruidDataSource();
        source.setDriverClassName(prop.getDriverClassName());
        source.setUrl(prop.getUrl());
        source.setUsername(prop.getUsername());
        source.setPassword(prop.getPassword());
        return source;
    }
}

