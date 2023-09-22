package com.khadri.spring.rest.entity;

public class Student {

	private String id;

	private String name;
 
	private String adress;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	
	

}
