package com.Teacher;

import java.util.Scanner;

public class Teachersinfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		System.out.println("pls enter your full name:");
		String name = in.nextLine();
		
		System.out.println("pls enter your age; ");
		int age = in.nextInt();
		
		System.out.println("pls enter your salalry; ");
		double salary = in.nextDouble();
		
		System.out.println("pls enter your bonus: ");
		double bonus = in.nextDouble();
		
		double totalSalary = salary + bonus;
		
		System.out.println("full name" + name );
		System.out.println("age" + age);
		System.out.println("salary" + salary);
		System.out.println("total salary:" + totalSalary);
		
	}}
	
