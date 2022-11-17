package comnurse;
import java.util.Scanner;
public class Nurse21 {
	
	public static void main(String[]args) {
   //TODD Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("plsenter your name:");
		
	
		String Nurse21fullname =in.next();

	    System.out.println("pls enter your age:");
	    int Nurse21Age = in.nextInt();
	    
	   System.out.println("plsenter your salary:");
	    double Nurse21salary =in.nextDouble();
	    System.out.println("pls enter your bonus:");
	    double Nurse21bonus = in.nextDouble();
	    double totalsalary =Nurse21salary + Nurse21bonus;
	    
	    System.out.println("Nursefullname: " + Nurse21fullname);
	    System.out.println("Nurse21 Age:" + Nurse21Age);
	    System.out.println("Nurse21Salary" + Nurse21salary);
	    System.out.println("Nurse21bonus:" + Nurse21bonus);
	    System.out.println("Nurse21 total salary:" + totalsalary);

	    
	    
	}
	
}