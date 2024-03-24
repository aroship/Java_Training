package com.example.demo;

import com.example.demo.datas.Employee;
import com.example.demo.repositories.EmployeeRepo;
import com.example.demo.services.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:spring.beans.xml")
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);


	}
}
