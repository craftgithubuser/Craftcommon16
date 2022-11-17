package lwam.test;

import java.util.Scanner;

public class Helloworld3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Scanner in = new Scanner(System.in);
    
    System.out.println("pls enter your name: ");
    String name = in.nextLine();

    System.out.println("Pls enter your salary: ");
    int salary = in.nextInt();

    System.out.println("Pls enter your bonus: ");
    double bonus = in.nextDouble();

    double total_salary = salary + bonus;

    
    
	}

}
