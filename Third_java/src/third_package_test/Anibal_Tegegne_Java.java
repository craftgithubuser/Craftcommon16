package third_package_test;

import java.util.Scanner;
public class Anibal_Tegegne_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner find = new Scanner(System.in);
		System.out.println("pls print your full name");
		String studentFullName = find.next();
		System.out.println("pls print your age");
		int studentAge = find.nextInt();
		System.out.println("pls print your salary");
		double studentSalary = find.nextDouble();
		System.out.println("pls print your bonus");
		double studentBonus = find.nextDouble();

		double studentTotalSalary = studentSalary + studentBonus ;
		
		System.out.println("pls print your full name: " + studentFullName);
		System.out.println("pls print you age: " + studentAge);
		System.out.println("pls print your salary: " + studentSalary);
		System.out.println("pls print your bonus: " + studentBonus);
		System.out.println("pls print your total salary: " + studentTotalSalary);
		
		System.out.println("pls print your total salary: " + studentTotalSalary);

	}
}