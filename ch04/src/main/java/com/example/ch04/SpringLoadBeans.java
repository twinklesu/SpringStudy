package com.example.ch04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLoadBeans {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringLoadBeans.class, args);
        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
