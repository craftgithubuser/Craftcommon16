package com.simpleCalculator;

import java.util.Scanner;

public class SipleCalculator {

	public static void main(String[] args) {

		double num1;
		double num2;
		char operatorSign;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter operator sign (+, -, *, /, %)");
		operatorSign = in.next().charAt(0);

		System.out.println("Please enter the first number");
		num1 = in.nextDouble();

		System.out.println("Please enter the first number");
		num2 = in.nextDouble();

		if (operatorSign == '+') {
			System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
			
		} else if (operatorSign == '-') {
			System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
			
		} else if (operatorSign == '*') {
			System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
			
		} else if (operatorSign == '/') {
			if (num2 != num2) {
				System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
			} else {
				System.out.println("Dividing numbers by zero is math error");
			}
			
		} else if (operatorSign == '%') {
			System.out.printf("%.2f modules %.2f = %.2f", num1, num2, (num1 % num2));
			
		} else {
			System.out.println("You entered invalid operator sign");
		}
	}
}
