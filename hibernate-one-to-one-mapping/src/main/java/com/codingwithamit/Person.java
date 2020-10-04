package com.codingwithamit;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mydb.person")
public class Person {
	@Id
	private int id;
	private String name;
	private String emailId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addreessId")
	Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
