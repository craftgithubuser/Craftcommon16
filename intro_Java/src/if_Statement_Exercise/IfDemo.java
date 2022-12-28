package if_Statement_Exercise;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		
		x= sc.nextInt();
		System.out.println("Input first integer");
		
		y= sc.nextInt();
		System.out.println("Input second Integer");
		
		if(x!=y){
			System.out.printf("\n" +" x is not equal to y");
		}
		if(x<y) {
			System.out.printf("\n" +"x is less than y");
		}
		if (x<=y)
		{System.out.printf("\n" +"x is less than or equal to y");
	}

}
}
