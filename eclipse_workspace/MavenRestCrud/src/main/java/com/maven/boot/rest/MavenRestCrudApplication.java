package com.maven.boot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.maven.boot.rest.controller.CustomerController;

@SpringBootApplication
//@ComponentScan(basePackageClasses = CustomerController.class)
@ComponentScan(basePackages = "com.maven.boot.rest")
public class MavenRestCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenRestCrudApplication.class, args);
	}

}
