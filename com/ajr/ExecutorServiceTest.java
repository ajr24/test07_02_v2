package com.ajr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		
	//	ExecutorService exectorService = Executors.newSingleThreadExecutor();
		
		ExecutorService exectorServicePool = Executors.newFixedThreadPool(2);
		
		Callable<Employee> cal = new Callable<Employee>(){
			public Employee call() throws Exception {
				Employee emp = new Employee();
				emp.setAge(30);
				emp.setName("jack");
				
				Employee emp1 = new Employee();
				emp1.setAge(18);
				emp1.setName("jill");
				
				Employee emp2 = new Employee();
				emp2.setAge(37);
				emp2.setName("jini");
				
				List<Employee> list = new ArrayList<>();
				list = Arrays.asList(emp, emp1, emp2);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return ComparableTest.getYoungestEmployee(list); 
			}
		};
		
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				for(long i=0;i<10000;i++) {
					if (i%2 == 0){
						System.out.println(i);
					
					}
				}
			}
		};
		exectorServicePool.submit(run);
		Future<Employee> future = exectorServicePool.submit(cal);
		
		
		try {
			Employee a = future.get();
			System.out.println("Emp"+a);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		exectorServicePool.shutdown();
	
		
		System.out.println("after shutdown");
		
		
		System.out.println("after shutdown1");
		
		System.out.println("after shutdown2");
	}
}

