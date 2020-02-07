package com.ajr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapContract {

	
	public static void main(String[] args) {
		
		
		
		HashMap<Employee, String> empMap = new HashMap<>();
		
		Employee emp = new Employee();
		emp.setAge(15);
		emp.setName("jonas");
		
		Employee emp1 = new Employee();
		emp1.setAge(61);
		emp1.setName("priyanks");
		
		Employee emp12 = new Employee();
		emp12.setAge(67);
		emp12.setName("parineeti");
		

		
		Employee empDuplicate = new Employee();
		empDuplicate.setAge(15);
		empDuplicate.setName("jonas");
		

		System.out.println(empMap.put(emp, "jonas"));

		System.out.println(empMap.put(emp1, "priyanks"));

		System.out.println(empMap.put(emp12, null));
		
		empMap.forEach((k,v)->{
				System.out.println("Key :"+k+"value :"+v);
		});
		
		String a = empMap.put(empDuplicate, "jenkin");
		System.out.println("Add dup op : "+a);

		System.out.println("post add");
		
//		 Set<Entry<Employee, String>> entrySet = empMap.entrySet();
//		 Iterator<Entry<Employee, String>> iterator = entrySet.iterator();
//		 while (iterator.hasNext()) {
//			 Entry<Employee, String> next = iterator.next();
//			System.out.println("key :"+next.getKey() +"value :"+next.getValue());
//		 }
		 
		 Set<Employee> set = empMap.keySet();
		 Iterator<Employee> empIterator = set.iterator();
		 while (empIterator.hasNext()){
			 Employee next = empIterator.next();
			 
				System.out.println("key :"+next +"value :"+ empMap.get(next));
		 }
		 
	}
}
