package com.hz.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);

//		new SpringApplicationBuilder()
//				.parent(Parent.class)
//				.child(SpringBootDemoApplication.class)
//				.run(args);

	}
}
