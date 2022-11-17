package mypackage;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	    System.out.println("pls enter your full name: ");
	    String name1 = input.nextLine();
	    
	    System.out.println("Pls enter your salary: ");
	    int salary1 = input.nextInt();

	    System.out.println("Pls enter your bonus: ");
	    double bonus1 = input.nextDouble();

	    double total_salary1 = salary1 + bonus1;
	    
	  

	    System.out.println("the name of the employee is : " + name1);
	    System.out.println("the salary of the employee is : " + salary1);
	    System.out.println("the bonus of the employee is : " + bonus1);
	    System.out.println("The total salary of the employee is : " + total_salary1);
	    
	    
	}

}
