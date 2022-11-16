package com_15;
import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		 System.out.println("pls enter your full name:");
		 String StudentInfoName = input.next();
		 System.out.println("pls enter Age");
		 int StudentInfoAge = input.nextInt();
		 System.out.println("pls enter your salary:");
		 double StudentInfoSalary = input.nextDouble();
		 System.out.println("pls enter your Bonus:");
         double StudentInfoBonus = input.nextDouble();
         System.out.println("pls enter your totalsalary:");
         double StudentInfototalSalary = StudentInfoSalary + StudentInfoBonus;
         System.out.println("StudentInfo Name:" + StudentInfoName);
    	 System.out.println("StudentInfo Age:" + StudentInfoAge);
    	 System.out.println("StudentInfo Salary:" + StudentInfoSalary);
    	 System.out.println("StudentInfo Bonus:" + StudentInfoBonus);
    	 System.out.println("StudentInfo total Salary:" + StudentInfototalSalary);
         
		 
		
	}

}
