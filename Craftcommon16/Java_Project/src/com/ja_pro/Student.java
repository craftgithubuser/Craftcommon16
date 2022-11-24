package com.ja_pro;

import java.util.Scanner;

public class Student {

	public static void main(String[] argrs) {
		Scanner st = new Scanner(System.in);

	    System.out.println("Please enter your name: ");
	    String name = st.nextLine();

	    System.out.println("Please enter your salary: ");
	    int salary = st.nextInt();

	    System.out.println("Please enter your bonus: ");
	    double bonus = st.nextDouble();

	    double total_salary = salary + bonus;

	    System.out.println("The name of the employee is : " + name);
	    System.out.println("The salary of the employee is : " + salary);
	    System.out.println("The bonus of the employee is : " + bonus);
	    System.out.println("The total salary of the employee is : " + total_salary);
	    


	}


	}

