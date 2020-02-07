package com.ajr.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<>();
		System.out.println(hash.add("Preethi"));
		System.out.println(hash.add("Karthi"));
		System.out.println(hash.add("Arthika"));
		System.out.println(hash.add("Arthishri"));
		System.out.println(hash.add("Arthiga"));
		System.out.println(hash.add("Arthiga"));
		System.out.println(hash.add(null));
		System.out.println(hash.add(null));
		 
		
		Iterator<String> iter = hash.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next()+",");
		}
		
		
		//Treeset
		TreeSet<String> treeSet = new TreeSet<>();
		
		System.out.println(treeSet.add("Preethi"));
		System.out.println(treeSet.add("Karthi"));
		System.out.println(treeSet.add("Arthika"));
		System.out.println(treeSet.add("Arthishri"));
		System.out.println(treeSet.add("Arthiga"));
		System.out.println(treeSet.add("Arthiga"));
		//System.out.println(treeSet.add(null));
		//System.out.println(treeSet.add(null));
		
		Iterator<String> treeSetIterator = treeSet.iterator();
		
		while(treeSetIterator.hasNext()){
			System.out.println(treeSetIterator.next()+",");
		}
		
		while(iter.hasNext()){
			System.out.println(iter.next()+",");
		}
		
		
	}

}
