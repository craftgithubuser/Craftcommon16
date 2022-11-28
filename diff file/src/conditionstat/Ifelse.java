package conditionstat;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System. in);
		System.out.println("enter your markr");
		double mark = in.nextDouble();
		
		String Grade;
		
		if (mark <=100 && mark >=90){
		   Grade = "A+";
		}
		   else if(mark <90 && mark >=80){
			   Grade = "A";
		   }
		   else if(mark <80 && mark >=70) {
			   Grade = "B";
		   }
		   else if (mark <70 && mark >=60) {
			   Grade = "c";
		   }
			   else if(mark <60 && mark >=50) {
				   Grade = "D";
			   }
			   else {
		Grade = "No Grade";
	    }
		System.out.println("student Grade:" + Grade);
		
	
			   
		   
			   
			   
		   }

	}


