package com.day5.condtionalstatements;

import java.util.Scanner;

public class IfElseIfLadderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter your mark:");
		double mark = in.nextDouble();
		
		String Grade;
		
		if(mark >=90 && mark <=100) { // 90-100
			Grade = "A+";
		}
		else if(mark >=83 && mark <=90) { 
			Grade = "A";
		}
		else if(mark >=75 && mark <=83) { 
			Grade = "B";
		}
		else if(mark >=65 && mark <=75) { 
			Grade = "C";
		}
		else if(mark >=50 && mark <=65) { 
			Grade = "D";
		}
		else {
			Grade = "No Grade";
		}
		System.out.println("Student Grade: " + Grade);
		}

	}


