package com.ajr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableTest {

	public static void main(String[] args) {
		
	/*	Employee emp = new Employee();
		emp.setAge(15);
		emp.setName("jonas");
		
		Employee emp1 = new Employee();
		emp1.setAge(61);
		emp1.setName("priyanks");
		
		Employee emp12 = new Employee();
		emp12.setAge(67);
		emp12.setName("parineeti");
		

		Employee emp6 = new Employee();
		emp6.setAge(32);
		emp6.setName("arthi");
		
		List<Employee> list = new ArrayList<>();
		list.add(emp);
		list.add(emp1);
		list.add(emp12);
		list.add(emp6);
		Collections.sort(list);
		
		System.out.println(list);
		getYoungestEmployee(list);*/
		
	}

	protected static Employee getYoungestEmployee(List<Employee> list) {
		Collections.sort(list, new AgeComparator());
		return list.get(0);
	}
	
	public double square(double input){
		return input * input;
	}
}
