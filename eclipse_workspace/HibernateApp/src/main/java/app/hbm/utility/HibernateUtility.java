package app.hbm.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import app.hbm.model.Address;
import app.hbm.model.Customer;
import app.hbm.model.Dealer;
import app.hbm.model.Product;

public class HibernateUtility {
	
	private static SessionFactory factory;

private HibernateUtility() {}
	
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			//factory = new Configuration().configure("com/hbm/config/hibernate.cfg.xml").buildSessionFactory();
			Configuration configuration = new Configuration().configure();//If hibernate.cfg.xml file name then to pass this name is optional in configuration(). If file name is other than this then need to provide name.
			configuration.addAnnotatedClass(Customer.class);
			configuration.addAnnotatedClass(Dealer.class);
			configuration.addAnnotatedClass(Address.class);
	        configuration.addAnnotatedClass(Product.class);
			ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			
			//factory = configuration.buildSessionFactory(); //Deprecated from hibernate 4
			factory = configuration.buildSessionFactory(registry);
			
		}
		return factory;
	}
}
