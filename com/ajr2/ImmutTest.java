package com.ajr2;

import com.ajr.Employee;

public class ImmutTest {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setName("arthi");
		emp.setAge(24);
		ImmutableClass imclass= new ImmutableClass(emp, "Arthi");
		
		emp.setName("shreen");
		
		Employee emp1 = imclass.getEmployee();
		System.out.println(emp1.getName());
	}
}
