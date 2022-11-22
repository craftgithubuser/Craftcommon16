package com.day4.oprators;

public class Assignment_Operators {

	public static void main(String[] args) {
		
		
		int a = 30;
		int b = 10;
		int c = 0;
		
		
		c = a + b;
		System.out.println("c = a + b " + c); // 40
		
		c += a;// c= c + a
		System.out.println("c += a = " + c); // 700
		
		c -= a; // c = c-a
		System.out.println("c -= a = " + c); //40
		
		c *= a; //c= c*a
		System.out.println("c *= a " + c); // 1200
		
		a=20;
		c=25;
		c%= a; // c = c%a
		System.out.println("c %= a =" + c); //5
		
		

	}

}
