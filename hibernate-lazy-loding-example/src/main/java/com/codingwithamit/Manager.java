package com.codingwithamit;

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

		Project project = session.load(Project.class, 1);// This load only Project table data
		System.out.println("Project object loaded from the database");
		System.out.println(project.getClientName());
		System.out.println(project.getProjectId());
		System.out.println(project.getProjectName());
		System.out.println();
		System.out.println("Now load Employee table");
		System.out.println();
		Set<Employee> employeelist = (Set<Employee>) project.getEmployeeList();// This line load the employee data. you
																				// can see the logs after this line it
																				// showing the select query
		for (Employee employee : employeelist) {
			System.out.println(employee);
		}
		session.close();

	}
}
