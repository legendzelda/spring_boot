package com.legendzelda.springboot.legendzelda.domain;

/**
 * created by bu.han on 2018/1/31
 * description:
 */
public class Customer {
	
	private Integer id;
	
	private String name;
	
	private String address;
	
	private Integer age;
	
	public Customer(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public Customer(Integer id, String name, String address, Integer age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
}
