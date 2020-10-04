package com.codingwithamit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager {

	public static void main(String[] args) {

		// set Address data
		Address address = new Address();
		address.setAddreessId(1);
		address.setHouseNumber(150);
		address.setStreetName("Malviya street");

		// set Person data
		Person person = new Person();
		person.setId(1);
		person.setName("codingwithamit");
		person.setAddress(address);

		Configuration config = new Configuration();
		config.configure();

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		session.save(person);
		session.getTransaction().commit();
		session.close();
		System.out.println("successfully saved");
		session.close();

	}
}
