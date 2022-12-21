package scannerclass;
import java.util.Scanner;
public class ImportedScanner {
	
	

		public static void main(String[] args) {
		
	System.out.println("---Enter of your name details---");
	try (Scanner in = new Scanner(System.in)) {
		System.out.print("enter your name:-- ");
		String name=in.next();
		System.out.println("Name: "+name);
		System.out.println("Enter your age: ");
		int iage=in.nextInt();
		System.out.println("age: "+iage);
		System.out.println("Enter your salary: ");
		double dwage= in.nextDouble();
		System.out.println("salary: "+dwage);
		System.out.println("salary: "+dwage);
		System.out.println("name: "+ name);
		System.out.println("age: "+ iage);
		System.out.println("salary: "+dwage);
	}




		}

	}
