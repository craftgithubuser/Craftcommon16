package com.dayz2;
 
import java.util.Scanner;

public class EmpInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("pls enter your full name;");
		String empName = in.next();
		
		System.out.println("pls enter your age:");
		int empAge = in.nextInt();
		
		System.out.println("pls enter your salary:");
		double empSalary = in.nextDouble();
		
		System.out.println("pls enter your bonus: ");
		double empBonus = in.nextDouble();
		
		double totalSalary = empSalary + empBonus; 
		
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Age: " + empAge);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Bonus: " + empBonus);
		System.out.println("Employee total Salary: " + totalSalary);
	}

}
