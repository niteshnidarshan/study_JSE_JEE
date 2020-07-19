package com.hbm.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hbm.model.Student;

public class HibernateUtils {

	private static SessionFactory factory;

	
	private HibernateUtils() {}
	
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			//factory = new Configuration().configure("com/hbm/config/hibernate.cfg.xml").buildSessionFactory();
			Configuration configuration = new Configuration().configure("com/hbm/config/hibernate.cfg.xml").addAnnotatedClass(Student.class); //If hibernate.cfg.xml file name then to pass this name is optional in configuration(). If file name is other than this then need to provide name.
	        
			ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			
			//factory = configuration.buildSessionFactory(); //Deprecated from hibernate 4
			factory = configuration.buildSessionFactory(registry);
			
		}
		return factory;
	}
}
