package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(MainApplication.class, args);
		System.out.println("Welcome to spring boot");
		Student objStu=context.getBean(Student.class);
		objStu.show();
		
		
	}

}
