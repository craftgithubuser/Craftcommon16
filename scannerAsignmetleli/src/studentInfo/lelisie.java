package studentInfo;

import java.util.Scanner;

public class lelisie {
       
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);

	    System.out.println("pls enter your name: ");
	    String name = in.nextLine();

	    System.out.println("Pls enter your salary: ");
	    int salary = in.nextInt();

	    System.out.println("Pls enter your bonus: ");
	    double bonus = in.nextDouble();

	    double totalsalary = salary + bonus;

	    System.out.println("the name of the student is : " + name);
	    System.out.println("the salary of the student is : " + salary);
	    System.out.println("the bonus of the student is : " + bonus);
	    System.out.println("The total salary of the student is : " + totalsalary);
	  }
	}
