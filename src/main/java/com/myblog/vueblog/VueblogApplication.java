package com.myblog.vueblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VueblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueblogApplication.class, args);
//        ConfigurableApplicationContext run = SpringApplication.run(VueblogApplication.class, args);
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for(String name: beanDefinitionNames){
//            System.out.println(name);
//        }

    }

}
