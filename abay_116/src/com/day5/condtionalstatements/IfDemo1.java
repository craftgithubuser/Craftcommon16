package com.day5.condtionalstatements;

import java.util.Scanner;

public class IfDemo1 {

	public static void main(String[] args) {

		// If statements
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter your mark:");
		double mark = in.nextDouble();

		if (mark >= 85) {
			System.out.println("Frist Division");
		}

		System.out.println("Outside of if statement");

	}

}
