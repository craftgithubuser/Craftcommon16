package com.studentinformation;

import java.util.Scanner;

public class StudentInfoApp {

    public static void main(String[] args) {
	    // TODO Auto-generated method stub

	    Scanner in = new Scanner(System.in);

	    System.out.println("please enter your name: ");
	    String name = in.nextLine();

	    System.out.println("Please enter your salary: ");
	    int salary = in.nextInt();

	    System.out.println("Please enter your bonus: ");
	    double bonus = in.nextDouble();

	    double totalSalary = salary + bonus;

	    System.out.println("The name of the student is : " + name);
	    System.out.println("The salary of the student is : " + salary);
	    System.out.println("The bonus of the student is : " + bonus);
	    System.out.println("The total salary of the student is : " + totalSalary);
	  }

    }