package com.trim.reg.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass()
public abstract  class BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "IDT_Client")
	private String IDT_Client;

	public String getIDT_Client() {
		return IDT_Client;
	}

	public void setIDT_Client(String iDT_Client) {
		IDT_Client = iDT_Client;
	}
	
	
	
}
