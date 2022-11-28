package com.sample2;

import java.util.Scanner;

public class Studentinfo2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your firstName");
		String firstName = input.next();
		
		System.out.println("Pls enter your lastName");
		String lastName = input.next();
		
		System.out.println("Pls enter your Age");
		int age = input.nextInt();
		
		System.out.println("Pls enter your salary");
		double Salary = input.nextDouble();
		
		System.out.println("Pls enter your bonus");
		double bonus= input.nextDouble();
		
		
		double totalSalary= Salary + bonus;
		
		System.out.println("Student First Name:"+ firstName);
		System.out.println("Student Last Name:" + lastName);
		System.out.println("Student Age:" + age);
		System.out.println("Student Salary:" + Salary);
		System.out.println("Student bonus:" + bonus);
		System.out.println("Student totalSalary:" + totalSalary);
	
	}

}
