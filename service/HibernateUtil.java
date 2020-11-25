package com.vicky.hibernateDemo.service;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vicky.hibernateDemo.hibernateDemo2.SampleModel;
public class HibernateUtil {
	public static SessionFactory sessionFactroy;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactroy==null)
		{
			Properties properties=new Properties();
			properties.setProperty("hibernate.Connection.driver_Class","org.h2.Driver");
			properties.setProperty("hibernate.Connection.Username","sa");
			properties.setProperty("hibernate.Connection.password","");
			properties.setProperty("hibernate.Connection.url","jdbc:h2:tcp://localhost/~/test");
			
			properties.setProperty("hibernate.dilact","org.hibernate.dilact.H2Dilact");
			properties.setProperty("hibernate.current_session_context_class","thread");
			properties.setProperty("hibernate.hbm2ddl.auto","update");
			properties.setProperty("hibernate.show_sql","true");
			properties.setProperty("hibernate.format_sql","true");
			
			Configuration config=new Configuration();
			config.addAnnotatedClass(SampleModel.class);
			
			ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(properties).build();
			System.out.println(registry);
			//try
			//{
				sessionFactroy =config.buildSessionFactory(registry);
				
			//}
			//catch(Exception e)
			//{
				//System.out.println(e.getMessage());
			//}
	}
		return sessionFactroy;
	}

}
