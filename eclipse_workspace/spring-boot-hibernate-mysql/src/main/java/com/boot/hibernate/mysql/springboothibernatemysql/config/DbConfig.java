package com.boot.hibernate.mysql.springboothibernatemysql.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@PropertySource(value={"classpath:application.properties"}) //To load properties file
public class DbConfig {

	//@Value("${jdbc.driverClassName}")// To load properties defined key
	private String driverClass = "com.mysql.cj.jdbc.Driver";
	
	//@Value("${jdbc.url}")
	private String url = "jdbc:mysql://localhost:3306/notes_app";//testdb";
	
	//@Value("${jdbc.username}")
	private String username = "root";
	
	//@Value("${jdbc.password}")
	private String password = "abc@031391743";
	
	//@Value("${hibernate.dialect}")
	private String dialect = "org.hibernate.dialect.MySQLDialect";
	
	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
		dataSource.setDriverClassName(driverClass);
		return dataSource;
		/*
		return DataSourceBuilder.create()
		          .driverClassName(driverClass)
		          .url(url)
		          .username(username)
		          .password(password)
		          .build(); 
		*/
		/*
		 	spring.datasource.url=jdbc:mysql://localhost:3306/db
			spring.datasource.username=
			spring.datasource.password=   
			spring.datasource.driver-class-name=com.mysql.jdbc.Driver
			spring.jpa.database-platform = org.hibernate.dialect.MySQL5Dialect
			spring.jpa.generate-ddl=true
			spring.jpa.hibernate.ddl-auto = update
		*/
	}
	
	private Properties hibernateProperties(){
		Properties properties = new Properties();
		/*properties.put("connection.driver-class", driverClass);
		properties.put("connection.url", url);
		properties.put("connection.username", username);
		properties.put("connection.password", password);
		properties.put("connection.url", url);*/
		
		properties.put("hibernate.dialect", dialect);
		properties.put("hibernate.hbm2ddl.auto", "update");
		//properties.put("hibernate.ddl-auto", "update");
		properties.put("hibernate.show-sql", "true");
		//properties.put("hibernate.format-sql", "true");
		return properties;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean sessioFactory = new LocalSessionFactoryBean();
		sessioFactory.setDataSource(getDataSource());
		sessioFactory.setHibernateProperties(hibernateProperties());
		sessioFactory.setPackagesToScan(new String[]{"com.boot.hibernate.mysql.springboothibernatemysql.model"});
		return sessioFactory;
	}
	/*
	@Bean
	public SessionFactory sessionFactory() {
		Configuration cfg = new Configuration();
		cfg.addProperties(hibernateProperties());
		return cfg.buildSessionFactory();
	}*/
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory factory){
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(factory);
		return transactionManager;
	}
	
}
