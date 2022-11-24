package IfElseStatment;

import java.util.Scanner;
public class IfStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter your mark: ");
		   double mark=in.nextDouble();
		   
		   if (mark>75) {
			   System.out.println("first division");
			   }
		   else {
			   System.out.println("second division");
			   
			   
		   }
	}

}
