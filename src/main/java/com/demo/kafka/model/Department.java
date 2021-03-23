package com.demo.kafka.model;

import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = 7234053017957524332L;
	private String id;
	private String name;

	public Department(String id, String name) {
		this.id = id;
		this.name = name;
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

}
