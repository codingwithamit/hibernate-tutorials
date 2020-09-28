package com.codingwithamit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Employee e1 = new Employee();
		e1.setId(102);
		e1.setName("CodingWithAmit");
		e1.setEmailId("autodidactprogrammer4u@gmail.com");

		session.save(e1);
		session.getTransaction().commit();
		session.close();
		System.out.println("successfully saved");
		session.close();

	}
}
