package intro_java;

import java.util.Scanner;

public class StudInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner hilina=	new Scanner(System.in);
		
		System.out.println("Pls enter your first name :");
		String studentfirstName= hilina.next();
		System.out.println("Pls enter your last name :");
		String  StudentlastName= hilina.next();
		System.out.println("Pls enter your age:");
		int studentage= hilina.nextInt();
		System.out.println("Pls enter your Salary");
		double studentSalary=hilina.nextDouble();
		System.out.println("Pls enter your Bonus");
		double studentBonus=hilina.nextDouble();
		System.out.println("Pls enter your total salary");

		double studentTotalSalary=hilina.nextDouble();


		System.out.println("Student first name:"+ " " + studentfirstName);
	    System.out.println("Student last name:"+ " " + StudentlastName);
	    System.out.println ("Student Age:" + studentage);
	    System.out.println("Student Salary:" + studentSalary);
	    System.out.println("Student bonus:" + studentBonus);
	    System.out.println("Student total Salary:" + "" +studentSalary + studentBonus);


	}

}
