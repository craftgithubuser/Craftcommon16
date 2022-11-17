   package com.Scanner002;

import java.util.Scanner;

public class StudentInfoScanner002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		 Scanner in = new Scanner(System.in);


		    System.out.println("pls enter your First Name: ");
		    String firstName = in.nextLine();

		    System.out.println("pls enter your last Name: ");
		    String lastname = in.nextLine();

		    System.out.println("pls enter your Age: ");
		    String age = in.nextLine();

		    System.out.println("Pls enter your salary: ");
		    int salary = in.nextInt();

		    System.out.println("Pls enter your bonus: ");
		    double bonus = in.nextDouble();

		    double totalsalary = salary + bonus;







		  		    System.out.println("The Full Name Of the student : " + firstName + " " + lastname);


		            System.out.println("the Age of the employee is : " + age);


		            System.out.println("the salary of the employee is : " + salary);


		            System.out.println("the bonus of the employee is : " + bonus);

		            System.out.println("The total salary of the employee is : " + totalsalary);




    // can somebody try to add on my project $ sign where it is applicable. 














	}

}




