package com.ludashen.interceptor;

//一定不要导错了日志包了
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @description:Springboot自定义拦截器
 * @author: 陆大哥
 * @Data: 2020-01-06 16:03
 */
@Slf4j
//private static final Logger log= LoggerFactory.getLogger(MyInterceptor.class);添加这个就等于了这个语句
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.debug("陆大哥最帅了1");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.debug("陆大哥最帅了2");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.debug("陆大哥最帅了3");
    }
}
