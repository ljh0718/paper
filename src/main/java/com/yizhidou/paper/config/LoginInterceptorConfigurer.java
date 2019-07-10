package com.yizhidou.paper.config;

import com.yizhidou.paper.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * 拦截器配置
 */
@Configuration
public class LoginInterceptorConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截路径:必须登录才可以访问
        List<String> patterns = new ArrayList<>();
        //patterns.add("/**");

        //白名单: 不需要登录就可以访问
        List<String> white_list = new ArrayList<>();
        /*white_list.add("/css/**");
        white_list.add("/fonts/**");
        white_list.add("/images/**");
        white_list.add("/js/**");
        white_list.add("/layui/**");

        white_list.add("/web/admin-add.html");
        white_list.add("/person/reg");
        white_list.add("/web/login.html");
        white_list.add("/person/login");
        white_list.add("/web/index.html");*/

        //注册拦截器
        registry
                .addInterceptor(new LoginInterceptor())
                .addPathPatterns(patterns)
                .excludePathPatterns(white_list);
    }
}
