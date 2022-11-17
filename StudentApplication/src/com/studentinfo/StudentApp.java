package com.studentinfo;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		// Create Scanner Object

		Scanner in = new Scanner(System.in);
		System.out.println("Please entere your name: ");
		String name = in.nextLine();

		System.out.println("Please enter your salary: ");
		int salary = in.nextInt();

		System.out.println("Please enter your bonus: ");
		double bonus = in.nextDouble();

		double totalSalary = salary + bonus;

		System.out.println("The Name of the Student is: " + name);
		System.out.println("The Salary of the Student is: " + salary);
		System.out.println("The Bonus of the Student is: " + bonus);
		System.out.println("The Total Salary of the Student is: " + totalSalary);

	}
}
