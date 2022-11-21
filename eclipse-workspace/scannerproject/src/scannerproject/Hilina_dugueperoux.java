package scannerproject;

import java.util.Scanner;

public class Hilina_dugueperoux {
	
	public static void main(String[]args) {
		
		Scanner mete= new Scanner(System.in);
		System.out.println("Pls enter your first name :");

		String studentfirstName= mete.next();

		System.out.println("Pls enter your last name :");

		String  StudentlastName= mete.next();

		System.out.println("Pls enter your age:");

		int studentage= mete.nextInt();

		System.out.println("Pls enter your Salary");

		double studentSalary=mete.nextDouble();

		System.out.println("Pls enter your Bonus");

		double studentBonus=mete.nextDouble();

		System.out.println("Pls enter your total salary");

		double studentTotalSalary=mete.nextDouble();
		
		System.out.println("Name" +" "+StudentlastName);
		System.out.println("Age" +" "+studentage);
		System.out.println("Salary" +" "+studentSalary);
		System.out.println("Bonus" +" "+studentBonus);
		System.out.println("Total Salary" +" "+studentTotalSalary);
		
		
		
	}

}
