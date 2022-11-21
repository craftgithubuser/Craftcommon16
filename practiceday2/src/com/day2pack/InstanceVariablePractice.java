package com.day2pack;

public class InstanceVariablePractice {

	int age = 25; // instance variable at the class level
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InstanceVariablePractice g2 = new InstanceVariablePractice();
		
		g2.method1();
		g2.method2();
	}

	
	public void method1() {
		int i = 25; // local variable method1 
		System.out.println("value of i:" + i);
		System.out.println("value of age:" + age);
	}
		
	

	public void method2() {
		
		int k = 30; // local variable method2
		System.out.println("value of k:" + k);
		System.out.println("value of age:" + age);
				
	}
		
	
}
