package com.codingwithamit;

import java.util.HashSet;
import java.util.Set;

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
		
		// one project can have multiple employee
//Employee names who are working in that project

		Employee employee = new Employee();
		employee.setFirstName("AMIT");
		employee.setEmpId(1);
		employee.setLastName("M");
		employee.setEmailId("AMIT@gmail.com");
		// Second employee
		Employee employee2 = new Employee();
		employee2.setEmpId(2);
		employee2.setFirstName("SUMIT");
		employee2.setLastName("M");
		employee2.setEmailId("SUMIT@gmail.com");
		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(employee);
		employeeSet.add(employee2);
		Project project = new Project();
		project.setProjectId(1);
		project.setClientName("CornerPoint");
		project.setProjectName("TABC");
		//Set employee set into the person object.
		project.setEmployeeList(employeeSet);
		session.save(project);
		session.getTransaction().commit();
		session.close();
		System.out.println("successfully saved");
		session.close();

	}
}
