package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Beanconfig {
    private Calculator calculator;
    @Bean
    public Calculator getCalculator(){
        return new Calculator();
    }
    @Bean(name = " annotation business-layer bean")
    public BusinessLayer getBusinessLayer(Calculator calculator){
        return new BusinessLayer(calculator);
    }
}
