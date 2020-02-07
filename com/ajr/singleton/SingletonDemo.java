package com.ajr.singleton;

public class SingletonDemo {

	public static void main(String[] args) throws InterruptedException {

//		System.out.println(OldSingleton.getInstance().hashCode());
//
//		System.out.println("2nd" + OldSingleton.getInstance().hashCode());

		Thread thread1 = new Thread(() -> {
			OldSingleton.getInstance();
			//System.out.println(OldSingleton.getInstance());
		});

		Thread thread2 = new Thread(() -> {
			OldSingleton.getInstance();
			//System.out.println(OldSingleton.getInstance());
		});

		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("counter" + OldSingleton.counter);
	}
}
