package com.bww.scanner;

import java.util.Scanner;

public class ScannerDemo101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String name = input.nextLine();

		System.out.println("Please enter your salary: ");
		Double salary = input.nextDouble();

		System.out.println("Please enter your bonus: ");
		Double bonus = input.nextDouble();

		Double total_salary = bonus + salary;

		input.close();

		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + total_salary);

	}

}
