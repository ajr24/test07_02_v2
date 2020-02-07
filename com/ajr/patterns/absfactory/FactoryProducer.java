package com.ajr.patterns.absfactory;

public class FactoryProducer {

	public static CarFactory getCaFactory(String factoryName) {
		switch (factoryName) {
		case "HONDA":
			return new HondaCarFactory();
		case "HYUNDAI":
			return new HyundaiCarFactory();
		}
		return null;
	}
}
