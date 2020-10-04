package com.codingwithamit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager {

	public static void main(String[] args) {

		CompositeKey compositeKey = new CompositeKey();
		compositeKey.setId(1);
		compositeKey.setEmailId("autodidactprogrammer4u@gmail.com");
		Employee e1 = new Employee();
		e1.setCompositeKey(compositeKey);
		;
		e1.setName("Amit");

		Configuration config = new Configuration();
		config.configure();

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		session.save(e1);
		session.getTransaction().commit();
		session.close();
		System.out.println("successfully saved");
		session.close();

	}
}
