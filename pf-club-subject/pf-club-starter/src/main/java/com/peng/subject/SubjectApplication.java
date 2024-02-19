package com.peng.subject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 刷题微服务启动类
 * @author: pengshengfeng
 * @date: 2024/2/19 15:55
 * @description:
 */
@SpringBootApplication
@ComponentScan("com.peng")
@MapperScan("com.peng.**.mapper")
public class SubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class);
    }
}
