package com.input;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
	// this code accept input from keyboard	
	    System.out.println("Please enter your first name:");
		String firstName = in.nextLine();
		
		System.out.println("Please enter your last name:");
		String lastName = in.nextLine();
		
		System.out.println("Please enter your age:");
		int age = in.nextInt();
		
		System.out.println("Please enter your salary: ");
		double salary = in.nextDouble();
		
		System.out.println("Please enter your bonus: ");
		double bonus = in.nextDouble();
		
		double totalSalary = salary+bonus;
		
	//this code print the above input data
		System.out.println("Your name: " + firstName + " "+ lastName);
		System.out.println("Your age: "+ age );
		System.out.println("Your salary: "+ salary );
		System.out.println("Your bonus: "+ bonus );
		System.out.println("Your total salary: "+ totalSalary );
	 
		
	}

}
