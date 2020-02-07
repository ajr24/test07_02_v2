package com.ajr.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Example {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 Person person = new Person();
		    person.setAge(20);
		    person.setName("Joe");
		    person.setTypicalLifeLength(70); 
		    
		    
		    
		    Address ad = new Address();
		    ad.setStreet1("strret1");
		    
		    person.setAddress(ad);
		    
		    
		    FileOutputStream fileOutputStream
		      = new FileOutputStream("yourfile.txt");
		    ObjectOutputStream objectOutputStream 
		      = new ObjectOutputStream(fileOutputStream);
		    objectOutputStream.writeObject(person);
		    objectOutputStream.flush();
		    objectOutputStream.close();
		     
		    FileInputStream fileInputStream
		      = new FileInputStream("yourfile.txt");
		    ObjectInputStream objectInputStream
		      = new ObjectInputStream(fileInputStream);
		    Person p2 = (Person) objectInputStream.readObject();
		    objectInputStream.close(); 
		  
		    System.out.println("age"+ (p2.getAge() == person.getAge()));
		    System.out.println("Name"+p2.getName().equals(person.getName()));
		    
		    System.out.println("LifeLen"+(p2.getTypicalLifeLength()==person.getTypicalLifeLength()));
	}
}
