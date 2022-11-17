package com.CraftKnowledge;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String empFirstName = "James";
		String empLastName = "Foxx";
		
		int empAge = 45;
		Double empSalary = 3000.00;
		Double empBonus = 1000.00;
		Double totalSalary = empSalary + empBonus;
		
		System.out.println(empFirstName);
		System.out.println(empLastName);
		System.out.println(empAge);
		System.out.println(empSalary);
		System.out.println(empBonus);
		System.out.println(totalSalary);
		
		
		System.out.println("Employee full Name: " + empFirstName + " " + empLastName);
		System.out.println("Employee Age:" + empAge);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Bonus: " + empBonus);
		System.out.println("Employee Total Salary " + totalSalary);
		

	}

}
