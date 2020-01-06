package com.ludashen.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//HikariCP日本人写的数据库连接池，数据较快
import javax.sql.DataSource;

/**
 * @description:
 * @author: 陆大哥
 * @Data: 2020-01-06 0:29
 */
@Controller
@Slf4j
public class HelloContrller {
    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        log.debug("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.printf("aaaaaaaaaaaaaaaaaaaaaaaa");
        return "你好啊，SpringBoot";
    }
}
