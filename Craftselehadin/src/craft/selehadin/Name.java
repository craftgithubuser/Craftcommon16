package craft.selehadin;

import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	System.out.println(" Please enter your first name");
	String name = in.nextLine();
	
	System.out.println(" please enter your last name");
	String last = in.nextLine();
	
	System.out.println("Enter your age");
	int age = in.nextInt();
	
	System.out.println("Enter your Salary");
	double salary = in.nextDouble();
	
	System.out.println("Enter your bonus");
	double bonus = in.nextDouble();
	
	double totalSalary = salary + bonus;
	
	System.out.println("Student's name is: " + name + " "  + last );
	System.out.println("Studnet's age is " + age);
	System.out.println("Students's total salary is " + totalSalary);
	}

}
