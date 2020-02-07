package com.ajr.patterns.absfactory;

public class HondaCarFactory implements CarFactory {

	@Override
	public Car createCar(String carType) {
		switch(carType){
			case "BRIO":
				return new BrioCar();
			case "CITY":
				return new CityCar();
		}
		return null;
	}

}
