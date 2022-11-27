package com.If;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		double mark =in.nextDouble();
		String Grade;
		if(mark <=100 && mark >=90);{
			Grade ="A+";
	}
		else if(mark <90 && mark >=80) {
		Grade "A-";
	}
		else if(mark <80 && mark >=70) {
		Grade = "B";
	}
		else if(mark <70 && mark >=60){
			Grade = "C";
		}
		else if(mark <60 && mark >=50) {
			Grade = "D";
	}
		else {
			Grade = "No Grade";
		}
	System.out.println();
}
