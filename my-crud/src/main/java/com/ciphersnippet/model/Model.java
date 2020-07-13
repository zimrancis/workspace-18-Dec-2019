package com.ciphersnippet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * RestClient: Insomnia
 * If I have to deal with services which returns 25 to 30 MB
 * responses then postman is struggling to handle it
 */
@Entity
public class Model {
	@Id
	private int id;
	private String name;
	private int age;
	
	public Model() {

	}

	public Model(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
