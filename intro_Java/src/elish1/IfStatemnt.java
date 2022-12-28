package elish1 ;

import java.util.Scanner;

public class IfStatemnt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc = new Scanner(System.in);
		
		num= sc.nextInt();

		if(num<0) {
			System.out.println("The number is negative");
		}
		if (num>0) {
			System.out.println("The number is positive");
		}
	
	}
}

	


