package com.demo.kafka.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1920606764559259334L;
	private String id;
	private String name;
	private Long salary;

	public User(String id, String name, Long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

}
