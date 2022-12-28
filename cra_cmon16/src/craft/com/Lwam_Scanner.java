package craft.com;
import java.util.Scanner;
public class ScannerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner readme=new Scanner(System.in);
System.out.println("Enter your name");
String name=readme.next();
System.out.println("Enter your age in years");
int age=readme.nextInt();
System.out.println("enter your Salary");
double Salary =readme.nextDouble();
System.out.print("Enter your message:");
String msg=readme.nextLine();

System.out.println("\n------------------");
System.out.println("Hello"+name);
System.out.println("your age is :" +age);
System.out.println("you are earning DS."+ Salary+"per month");
		
	}

}
