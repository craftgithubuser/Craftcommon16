package worknehDestaStudent1;



import java.util.Scanner;

public class student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); {
		
		 System.out.println("pls enter your first name:");
		 String firstName = input.next();

		 System.out.println("pls enter your last name:");
		 String lastName = input.next();
		 
		 System.out.println("pls enter your age:");
		 int stuAge = input.nextInt();
		 
		 System.out.println("pls enter your salary:");
		 double stuSalary = input.nextDouble();
		 
		 System.out.println("pls enter your bonus:");
		 double stuBonus = input.nextDouble();
		 
		 System.out.println("pls enter your totalsalary:");
		 double stuTotalSalary = stuSalary + stuBonus;
		 
		 
		 System.out.println("Student First Name:" +firstName);		
		 System.out.println("Student Last  Name:" + lastName);
		 System.out.println("Student Age:" + stuAge);
		 System.out.println("Student Salary:" + stuSalary);
		 System.out.println("Student Bonus:" + stuBonus);
		 System.out.println("Student total Salary:" + stuTotalSalary);
		 
		 
		 
		}

	}	
}