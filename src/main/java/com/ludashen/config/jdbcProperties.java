package com.ludashen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2020-01-06 14:21
 */
@Data
public class jdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;
}
