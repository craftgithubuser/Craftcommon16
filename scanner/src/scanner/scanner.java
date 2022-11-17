package scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);

		    System.out.println("pls enter your name: ");
		    String name = in.nextLine();
		    
		    System.out.println("Pls enter your age: ");
		    int age = in.nextInt();

		    System.out.println("Pls enter your salary: ");
		    int salary = in.nextInt();

		    System.out.println("Pls enter your bonus: ");
		    double bonus = in.nextDouble();

		    double total_salary = salary + bonus;

		    System.out.println("the name of the employee is : " + name);
		    System.out.println("the salary of the employee is : " + salary);
		    System.out.println("the bonus of the employee is : " + bonus);
		    System.out.println("The total salary of the employee is : " + total_salary);
	}

}
