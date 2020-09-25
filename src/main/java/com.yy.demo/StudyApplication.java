package com.yy.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import com.yy.demo.utils.SpringContextUtils;


@Configuration
@SpringBootApplication
@Slf4j

public class StudyApplication{
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        ApplicationContext context = SpringApplication.run(StudyApplication.class, args);
        SpringContextUtils.setApplicationContext(context);
    }
}