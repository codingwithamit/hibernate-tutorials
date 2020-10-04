package com.codingwithamit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveResults {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Project project = (Project) session.get(Project.class, 1);
		System.out.println("***********************");
		System.out.println(project.getClientName());
		System.out.println(project.getProjectName());
		for (Employee employee : project.getEmployeeList()) {
			System.out.println(employee.getEmpId());
		}

		session.close();
		session.close();

	}
}
