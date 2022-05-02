package com.simplilearn.aeroplane.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.simplilearn.aeroplane.dto.RegisterUser;
import com.simplilearn.aeroplane.dto.SeatBooked;
import com.simplilearn.aeroplane.dto.TravelData;



public class HibernateUtil {
private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory()
	{	if(factory==null) {
		
		Configuration configuration=new Configuration();
		
		Properties properties=new Properties();
		properties.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/exercise");
		properties.setProperty(Environment.USER, "root");
		properties.setProperty(Environment.PASS, "Chemistry22@");
		properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		
		//DATABASE Specific connectivity property
		properties.setProperty(Environment.SHOW_SQL, "true");
		properties.setProperty(Environment.HBM2DDL_AUTO, "update");
		
		//properties need to confogure into configuration
		configuration.setProperties(properties);
		
		//class that holds mapping --configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(RegisterUser.class);
		configuration.addAnnotatedClass(TravelData.class);
		configuration.addAnnotatedClass(SeatBooked.class);
		
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		factory=configuration.buildSessionFactory(registry);
		
		return factory;
	
	}	
	return factory; 
	}
}
