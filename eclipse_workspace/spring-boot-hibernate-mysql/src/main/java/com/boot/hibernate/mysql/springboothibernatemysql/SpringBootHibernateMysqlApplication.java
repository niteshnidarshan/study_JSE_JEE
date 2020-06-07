package com.boot.hibernate.mysql.springboothibernatemysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = "com.boot.hibernate.mysql")
public class SpringBootHibernateMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateMysqlApplication.class, args);
	}

}
