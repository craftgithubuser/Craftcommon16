package com.Ephrem_Tirfe;

import java.util.Scanner;

public class Ephrem_Tirfe_Scanner_project {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter Your First Name");
		String firstname = in.nextLine();
		
		System.out.println("Please Enter Your last Name");
		String lastname = in.nextLine();

		System.out.println("Please Enter Your Sex");
		String Sex = in.nextLine();

		System.out.println("Please Enter Your Age");
		int age = in.nextInt();

		System.out.println("Please Enter Your Salary");
		double salary = in.nextDouble();
		
		System.out.println("Please Enter Your Bonus");
		double bonus = in.nextDouble();
		
		double totalSalary = salary + bonus;
		
		System.out.println("The Full Name Of The Student Is: " + firstname + " " + lastname);
		System.out.println("The Sex Of The Student Is: " + Sex);
		System.out.println("The Age Of The Student Is: " + age);
		System.out.println("The Slalary Of The Student Is: " + salary);
		System.out.println("The Bonus Of The Student Is: " + bonus);
		System.out.println("The Total Salary Of A Student Is: " + totalSalary);
	}

}
