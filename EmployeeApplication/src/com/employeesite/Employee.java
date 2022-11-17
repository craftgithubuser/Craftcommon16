
package com.employeesite;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("please enter your name: ");
		String name = in.nextLine();

		System.out.println("Please enter your salary: ");
		int salary = in.nextInt();

		System.out.println("Please enter your bonus: ");
		double bonus = in.nextDouble();

		double totalSalary = salary + bonus;

		System.out.println("The name of the Employee is : " + name);
		System.out.println("The salary of the Employee is : " + salary);
		System.out.println("The bonus of the Employee is : " + bonus);
		System.out.println("The total salary of the Employee is : " + totalSalary);
	}

}