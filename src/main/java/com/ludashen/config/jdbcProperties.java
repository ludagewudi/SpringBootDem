package com.ludashen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2020-01-06 14:21
 */
//配置文件一定要命名为application.properties
//会帮我们自动生成getset等，编译式有
//    这样注入不成功，这时我们需要声明前缀,要与配置文件等号前边一致才行
//@ConfigurationProperties
@ConfigurationProperties(prefix = "jdbc")
@Data
public class jdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;
}
