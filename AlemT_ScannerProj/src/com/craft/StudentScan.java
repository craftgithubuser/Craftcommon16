package com.craft;

import java.util.Scanner;

public class StudentScan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your information...");
		System.out.println("Enter your last name: ");
		String studLastName = scan.next();
		System.out.println("Enter your first name: ");
		String studFirstName = scan.next();
		System.out.println("Enter your age: ");
		int studAge = scan.nextInt();
		System.out.println("Enter your salary: ");
		double studSalary = scan.nextDouble();
		System.out.println("Enter your bonus: ");
		double signUpBonus = scan.nextDouble();
		System.out.println("Full name: " + studFirstName + " " + studLastName);
		System.out.println("Age: " + studAge);
		System.out.println("Student salry: " + studSalary);
		System.out.println("Sign up Bonus: " + signUpBonus);

		scan.close();

	}

}
