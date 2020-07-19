package com.hbm.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hbm.model.Student;

public class HibernateUtils {

	private static SessionFactory factory;
	private HibernateUtils() {}
	
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
			/*try {
                // Create registry
                registry = new StandardServiceRegistryBuilder().configure("com/hbm/config/hibernate.cfg.xml").build();
                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registry);
                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();
                // Create SessionFactory
                factory = metadata.getSessionFactoryBuilder().build();
				
				Configuration configuration = new Configuration();

			    // Hibernate settings equivalent to hibernate.cfg.xml's properties
			    Properties settings = new Properties();
			    settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			    settings.put(Environment.URL, "jdbc:mysql://localhost:3306/notes_app?useSSL=false");
			    settings.put(Environment.USER, "root");
			    settings.put(Environment.PASS, "abc@031391743");
			    settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

			    settings.put(Environment.SHOW_SQL, "true");

			    settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

			    settings.put(Environment.HBM2DDL_AUTO, "update");

			    configuration.setProperties(settings);
			    configuration.addAnnotatedClass(Student.class);

			    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
			      .applySettings(configuration.getProperties()).build();
			    System.out.println("Hibernate Java Config serviceRegistry created");
			    factory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }*/
		}
		return factory;
	}
}
