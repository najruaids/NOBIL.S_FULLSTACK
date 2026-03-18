package com.example.simpleapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SimpleappApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SimpleappApplication.class, args);
        String[] beans = context.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println(bean);
        }
        System.out.println("Application Started");
    }
}