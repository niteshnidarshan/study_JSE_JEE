package com.jersey.rest.hibernate.jersey_rest.dbutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

	private static SessionUtil instance = new SessionUtil();
	private SessionFactory sessionFactory;
	
	public static SessionUtil getInstance() {
		return instance;
	}
	
	@SuppressWarnings("deprecation")
	private SessionUtil() {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		sessionFactory = conf.buildSessionFactory();
	}
	
	public static Session getSession() {
		Session session = getInstance().sessionFactory.openSession();
		
		return session;
	}
}
