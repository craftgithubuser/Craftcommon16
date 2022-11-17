package com.CraftKnowledge;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String studFirstName = "James";
		String studLastName = "Foxx";
		
		int studAge = 45;
		Double studSalary = 3000.00;
		Double studBonus = 1000.00;
		Double totalSalary = studSalary + studBonus;
		
		System.out.println(studFirstName);
		System.out.println(studLastName);
		System.out.println(studAge);
		System.out.println(studSalary);
		System.out.println(studBonus);
		System.out.println(totalSalary);
		
		
		System.out.println("Student full Name: " + studFirstName + " " + studLastName);
		System.out.println("Student Age:" + studAge);
		System.out.println("Student Salary: " + studSalary);
		System.out.println("Student Bonus: " + studBonus);
		System.out.println("Student Total Salary " + totalSalary);

	}

}
