package com.ludashen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2020-01-06 0:23
 * 注意： 这个类不能放在第一层文件夹里边，不然可能启动失败
 */
@SpringBootApplication
public class Myboot {
    public static void main(String[] args) {
        SpringApplication.run(Myboot.class);
    }
}
