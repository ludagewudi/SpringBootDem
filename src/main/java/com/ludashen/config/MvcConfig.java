package com.ludashen.config;

import com.ludashen.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description: 配置MVC拦截器（类似SSM项目里边的配置）
 * @author: 陆大哥
 * @Data: 2020-01-06 16:15
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
//    添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
