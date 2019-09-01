package com.lav.lambda;

/*
 * Thread variables are local to a specific thread 
 * and are therefore thread safe, this is introduced to improve 
 * efficiency and maintain integrity
 */

public class ThreadLocalExample {

	public static ThreadLocal<String> threadVariable = ThreadLocal.withInitial(() -> new String("Hello there!"));

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			new Thread(() -> System.out.println("Output is: " + ThreadLocalExample.threadVariable.get())).start();
		}

	}
}
