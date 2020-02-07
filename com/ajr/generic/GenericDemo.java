package com.ajr.generic;

public class GenericDemo {

	private <E extends Number> void  print(E[] list){
		for(E e: list ){
			System.out.print(e+ ",");
		}
		System.out.println("EOM");
	}
	
	public static void main(String[] args) {
		
		String[] s = new String[3];
		s[0] = "dog";
		s[1] = "cat";
		s[2] = "cow";
		
		Integer[] numbers ={1,45,81,90};
		
		GenericDemo demo = new GenericDemo();
		//demo.print(s); compile time error
		
		demo.print(numbers);
		
	}
	
}

