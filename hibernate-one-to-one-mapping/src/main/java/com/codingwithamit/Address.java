package com.codingwithamit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mydb.address")
public class Address {
	@Id
	private int addreessId;
	private int houseNumber;
	private String streetName;

	public int getAddreessId() {
		return addreessId;
	}

	public void setAddreessId(int addreessId) {
		this.addreessId = addreessId;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}
