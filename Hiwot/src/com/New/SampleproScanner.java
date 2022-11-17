package com.New;

import java.util.Scanner;

public class SampleproScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

			Scanner input = new Scanner(System.in);
					
			System.out.println("Pls enter your firstName");
			String firstName=input.next();
			
			System.out.println("pls enter your lastName");
			String lastName=input.next();
			
			System.out.println("pls enter your age");
			int Age= input.nextInt();
			
			System.out.println("pls enter your salary");
			double Salary=input.nextDouble();
			
			System.out.println("pls enter your bonus");
			double bonus=input.nextDouble();
			
			
			double total_Salary= Salary + bonus;
			
			System.out.println("Student first name:"+ " " + firstName);
			System.out.println("Student last name:"+ " " + lastName);
			System.out.println ("Student Age:" + Age);
			System.out.println("Student Salary:" + Salary);
			System.out.println("Student bonus:" + bonus);
			System.out.println("Student total Salary:" + "" +Salary + bonus);	
		
	}

}
