package com.ajr;

import java.util.Comparator;

public class AgeComparator implements Comparator<Object>{
	
	public int compare(Object emp1, Object emp2){
		return ((Employee)emp1).getAge() -(((Employee)emp2).getAge());
	}

}
