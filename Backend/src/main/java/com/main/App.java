package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tables.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("com/main/hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	User user=new User();
    	user.setId(1);
    	user.setName("Farhan");
    	user.setEmail("farhanfk2001@gmail.com");
    	user.setPassword("123");
    	user.setCreated_at(null);
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	session.save(user);
    	tx.commit();
    	
    	session.close();
    	factory.close();
    	
    	
    }
}
