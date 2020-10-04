package com.codingwithamit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mydb.employee")
public class Employee {
	@Id
	@Column(name = "empId")
	private int empId;
	@Column(name = "emailId")
	private String emailId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	
	/*
	 * @ManyToOne private Project Project;
	 */

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
	 * public void setProject(Project project) { Project = project; }
	 * 
	 * public Project getProject() { return Project; }
	 */
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "["+"empId ="+empId+", emailId"+emailId+",firstName="+firstName+",lastName="+lastName+" "+"]";
}
}
