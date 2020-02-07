package com.ajr.patterns.absfactory;

public class Demo {

	public static void main(String[] args) {
		
		CarFactory carFactory = null;
		String hyundaiFactoryName = "HYUNDAI";
		carFactory = FactoryProducer.getCaFactory(hyundaiFactoryName);
		carFactory.createCar("I10").drive();

		
		String hondaFactoryName = "HONDA";
		carFactory = FactoryProducer.getCaFactory(hondaFactoryName);
		
		carFactory.createCar("BRIO").drive();
	}
}
