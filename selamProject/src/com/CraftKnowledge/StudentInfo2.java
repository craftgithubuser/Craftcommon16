package com.CraftKnowledge;

import java.util.Scanner;

public class StudentInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("pls enter your First name: ");
		String studFirstName = in.next();
		
		System.out.println("pls enter your Last name: ");
		String studLastName = in.next();
		
		System.out.println("pls enter your Age: ");
		int studAge = in.nextInt();
		
		System.out.println("pls enter your Salary: ");
		double studSalary = in.nextDouble();
		
		System.out.println("pls enter Bonus: ");
		double studBonus = in.nextDouble();
		
		double totalSalary = studSalary + studBonus;
		
		System.out.println("Student full Name: " + studFirstName + " " + studLastName);
		System.out.println("Student Age:" + studAge);
		System.out.println("Student Salary: " + studSalary);
		System.out.println("Student Bonus: " + studBonus);
		System.out.println("Student Total Salary " + totalSalary);
		

		
		
		
		
		

	}

}
