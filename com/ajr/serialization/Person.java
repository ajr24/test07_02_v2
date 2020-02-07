package com.ajr.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Person extends LivingBeing implements Serializable   {
/**
	 * 
	 */
	private static final long serialVersionUID = 8481113846242756966L;
	//	private static final long serialVersionUID = 1L;
	static String country = "ITALY";
	private int age;
	private String name;
	transient int height;
	private Address address;
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Person.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void writeExternal(ObjectOutput out) {
		
	}
	public void readExternal(ObjectInput in) {
		// TODO Auto-generated method stub
		
	}

	
	
}