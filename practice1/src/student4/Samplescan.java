package student4;
import java.util.Scanner;

public class Samplescan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
				Scanner in = new Scanner(System.in);
				System.out.println("pls enter your name:");
				String name= in.nextLine();
				System.out.println("pls enter your salary:");
				int salary = in.nextInt();
				System.out.println("pls enter your bonus:");
				double bonus = in.nextDouble();
				double total_salary = salary + bonus;
				System.out.println("the name of the student is:" + name);
				System.out.println("the salary of the student is:" + salary);
				System.out.println("the bonus of the student is:" + bonus);
				System.out.println("the total salary of the student is:" + total_salary);
				
		// scanner practice 
			}	
		
		
	}


