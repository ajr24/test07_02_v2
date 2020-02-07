package com.ajr.patterns.absfactory;

public class HyundaiCarFactory implements CarFactory {

	@Override
	public Car createCar(String carType) {
		switch (carType) {
		case "I10":
			return new I10Car();
		case "I20":
			return new I20Car();
		}
		return null;
	}

}
