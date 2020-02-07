package com.ajr.singleton;

import javax.xml.parsers.DocumentBuilderFactory;

public class OldSingleton {
	
	private static OldSingleton oldSingleton = null;
	
	private static boolean initFlag = false;
	
	public static int counter = 0;
	
	private OldSingleton(){
		
	}
	
	private void init(){
		
	}
	public static synchronized OldSingleton getInstance(){
		
		if (initFlag){
			return oldSingleton;
		}
		oldSingleton = new OldSingleton();
		counter++;
		oldSingleton.init();
		initFlag = true;
		return oldSingleton;
	}

}
