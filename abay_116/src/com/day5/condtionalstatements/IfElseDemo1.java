package com.day5.condtionalstatements;

import java.util.Scanner;

public class IfElseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If- else statements
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter your mark:");
		double mark = in.nextDouble();
		
		if(mark >= 85) {
			System.out.println("First Division");
		}
		else {
			System.out.println("Scond Division");
		}

	}

}
