package com.bridgelabz.usingannotationspostandpre;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private int id;
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
    @PostConstruct
	public void init() {
		System.out.println("Init Method");
	}
    @PreDestroy
	public void destroy() {
		System.out.println("Destroy Bean");
	}
}
