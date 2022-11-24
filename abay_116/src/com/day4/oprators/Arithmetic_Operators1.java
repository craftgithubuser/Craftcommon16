package com.day4.oprators;

public class Arithmetic_Operators1 {

	public static void main(String[] args) {
	
		int a, b, c;
		a = 10;
		b = 2;
		
		c = a + b;
		System.out.println("Addion: " + c); //12
		
		c = a - b;
		System.out.println("Substraction: " + c); //6
		
		c = a * b;
		System.out.println("multiplication: " + c); //20
		c = a / b;
		System.out.println("Division: " + c); //5
		
		b =3;
		c = a % b;
		System.out.println("Remainedr: " + c); //1
		
		a = ++a;
		System.out.println("Incremet Operator: " +a); //a = 11
		a = --a;
		System.out.println("Dccrement Oprator: " + a); // 10
		
		

	}

}
