package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.dao")
@ComponentScan(basePackages = {"com.*"})
public class demoApplication {
    public static void main(String args[]){

    }
}
