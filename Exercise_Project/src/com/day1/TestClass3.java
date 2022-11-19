

package com.day1;

import java.util.Scanner;

public class TestClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("pls inter your name:");
		String name = in.nextLine();
	
		System.out.println("pls inter your department:");
		String department = in.nextLine();
		
		System.out.println("pls inter your salary:");
		int salary = in.nextInt();
		
		System.out.println("pls inter your bonus:");
		double bonus = in.nextDouble();
		
		double total_salary = salary + bonus;
		
		System.out.println("the name of the employee is: "  + name);
		System.out.println("the department of the employee is: " + department);
		System.out.println("the salary of the employee is: " + salary);
		System.out.println("the bonus of the employee is: " + bonus);
		System.out.println("the total salary of the employee is: " + total_salary);
	}

}
