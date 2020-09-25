package com.yy.demo.utils;

import org.springframework.context.ApplicationContext;

public class SpringContextUtils{
    private static ApplicationContext context;

    public static void setApplicationContext(ApplicationContext context) {SpringContextUtils.context = context; }

}
