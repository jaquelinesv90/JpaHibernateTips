package com.pahibernatetips;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class Person {
	
	@Id
	private Long id;
	
	private String name;
	
	private byte age;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}
	
}
