package com.dayz2;

public class EmpInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String empFirstName = "Zeaman";
		String empLastName = "Ephrem";
		
		int empAge = 45;
		
		double empSalary = 4000.33;
		
		double empBonus = 400;
		
		double totalSalary = empSalary + empBonus; //4400.33
		
		System.out.println("Employee full name: " + empFirstName + " " + empLastName); // Zeaman Ephrem
		System.out.println("Employee Age: " + empAge);		
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Bonus: " + empBonus);
		System.out.println("Employee Total Salary: " + totalSalary);
		
		
	}

}
