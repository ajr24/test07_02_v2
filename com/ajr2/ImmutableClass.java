package com.ajr2;

import com.ajr.Employee;

final public class ImmutableClass {

	final private Employee emp;
	final private String name;
	
	public String getName() {
		return name;
	}

	public ImmutableClass(Employee emp, String name) {
		super();
		
/*		Employee empCopy = new  Employee();
		empCopy.setAge(emp.getAge());
		empCopy.setName(emp.getName());
		this.emp = empCopy;*/
		this.emp = emp;
		this.name = name;
	}
	
	public ImmutableClass getImmutableObj(){
		Employee emp = new Employee();
		emp.setAge(this.emp.getAge());
		emp.setName(this.emp.getName());
		return new ImmutableClass(emp, name);
	}
	
	
	public Employee getEmployee(){
		Employee emp = new Employee();
		emp.setAge(this.emp.getAge());
		emp.setName(this.emp.getName());
		return emp;
	}
}
