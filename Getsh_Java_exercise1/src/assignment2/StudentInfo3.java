package assignment2;


import java.util.Scanner;



public class StudentInfo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner g = new Scanner(System.in);
			
			System.out.println("pls enter your full name: ");
			String firstName = g.next();
			
			System.out.println("pls enter your age:");
			int studAge = g.nextInt();
			
			System.out.println("pls enter your salary:");
			double studSalary = g.nextDouble();
			
			System.out.println(" pls enter your bonus:");
			double studBonus = g.nextDouble();
			
			double totalStudsalary = studSalary + studBonus;
			
			System.out.println("student first name:" + firstName);
			System.out.println("student age:" + studAge);
			System.out.println("student salary:" + studSalary);
			System.out.println("student bonus:" + studBonus);
			System.out.println("total studen salary:" + totalStudsalary);	
		
		
		
		
		
		
	}

}
