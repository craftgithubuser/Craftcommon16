package sample22;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("pls enter your fullName");
		String name = in. nextLine();
		
		System.out.println("pls enter your age");
		int age = in.nextInt();
		
		System.out.println("pls enter your salary");
		double salary =in.nextDouble();
		
		System.out.println("pls enter your bonus");
		double bouns = in.nextDouble();
		
		double total_salary = salary + bouns;
		
		System.out.println("the name of student" + name);
		System.out.println("the age of student" + age);
		System.out.println("the salary of student" + salary);
		System.out.println("the bouns of student" + bouns);
		System.out.println("the total salary of student" + total_salary);
		
		
		
		
		
		
		
		

	}

}
