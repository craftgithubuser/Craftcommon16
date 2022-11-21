package com.day1pack;

public class LocalVariablePractice {

	public static void main(String[] args) {
		// local variable practice

		LocalVariablePractice g1 = new LocalVariablePractice(); // creating an object
		
		g1.method1();
		g1.method2();
		
		
	}
	
	public void method1() {
		int j = 25; // local variable method1 
		System.out.println("value of j:" + j);
		
	}
		
	

	public void method2() {
		
		int k = 30; // local variable method2
		System.out.println("value of k:" + k);
		
			
	}


	
}
