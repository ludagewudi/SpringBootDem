package com.ludashen.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2020-01-06 0:29
 */
@Controller
public class HelloContrller {
    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "你好啊，SpringBoot";
    }
}
