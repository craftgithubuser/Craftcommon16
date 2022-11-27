package Student;

import java.util.Scanner;
public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner (System.in);

        System.out.println("Please enter your Firstname: ");
		String firstName = in.nextLine();
		
		 System.out.println("Please enter your Lastname: ");
			String lastName = in.nextLine();
		
		System.out.println("Please enter your Age: ");
		int age =in.nextInt();
		
		System.out.println("Please enter your Salary: ");
		Float salary = in.nextFloat();
		
		System.out.println("Please enter your city: ");
	    String city = in.next();
		
		System.out.println("Please enter your Bonus: ");
		Double bonus = in.nextDouble();
		
		
	    
		//Out put

		 System.out.println("Employee Full name is:  " + firstName +" "+ lastName);
		 System.out.println("Employee age is :  " + age);
		 System.out.println("Employee Salary is: " + salary);
		 System.out.println("Employee Bonus is: " + bonus);
		 System.out.println("Employee City is: " + city);
	
		in.close();
	}
	

}
