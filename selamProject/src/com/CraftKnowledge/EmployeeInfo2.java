package com.CraftKnowledge;

import java.util.Scanner;

public class EmployeeInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner (System.in);
		
		System.out.println("pls enter your First name: ");
		String empFirstName = in.next();
		
		System.out.println("pls enter your Last name: ");
		String empLastName = in.next();
		
		System.out.println("pls enter your Age: ");
		int empAge = in.nextInt();
		
		System.out.println("pls enter your Salary: ");
		double empSalary = in.nextDouble();
		
		System.out.println("pls enter Bonus: ");
		double empBonus = in.nextDouble();
		
		double totalSalary = empSalary + empBonus;
		
		System.out.println("Employee full Name: " + empFirstName + " " + empLastName);
		System.out.println("Employee Age:" + empAge);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Bonus: " + empBonus);
		System.out.println("Employee Total Salary " + totalSalary);
				

		

	}

}
