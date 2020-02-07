package com.ajr;

public enum TestEnum {

	HAI("1"),
	HELLO("2"),
	BYE("3");
	
	private String value;
	
	TestEnum(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public  TestEnum[] getValues(){
		return TestEnum.values();
	}
}
