package com.craft1;



import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    Scanner input = new Scanner(System.in);

			    System.out.println("pls enter your first name: ");
			    String firstName = input.nextLine();

			    System.out.println("pls enter your last name: ");
			    String lastName = input.nextLine();
			    
			    System.out.println("Pls enter your age: ");
			    int Age = input.nextInt();

			    System.out.println("Pls enter your salary: ");
			    double Salary = input.nextDouble();
			    
			    System.out.println("Pls enter your bonus: ");
			    double Bonus = input.nextDouble();

			    double total_salary = Salary + Bonus;

			    System.out.println("the name of the employee is : " + firstName);
			    System.out.println("the name of the employee is : " + lastName);
			    System.out.println("the age of the employee is : " + Age);
			    System.out.println("the salary of the employee is : " + Salary);
			    System.out.println("the bonus of the employee is : " + Bonus);
			    System.out.println("The total salary of the employee is : " + total_salary);
	}
			  }
