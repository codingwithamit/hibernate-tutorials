package com.codingwithamit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmailId("autodidactprogrammer4u@gmail.com");

		Configuration config = new Configuration();
		config.configure();

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		e1.setFirstName("Rajesh");
		session.save(e1);
		session.getTransaction().commit();
		session.close();

		Session session2 = factory.openSession();
		session2.beginTransaction();

		e1.setFirstName("Amit");
		session2.save(e1);//his method moves a detached object into a persistent state
		session2.getTransaction().commit();
		session2.close();
	}
}
