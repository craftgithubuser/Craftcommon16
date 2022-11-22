package com.loop;

import java.util.Scanner;

public class BreakClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		
		double sum=0;
		double num=0;
		
		for(int i=0; i<=10; i++) {
			
			System.out.println("please enter number");
			
			num = in.nextDouble();
			
		if(num <0) {
				break;
			}
		sum +=num;
		}
		 
		System.out.println("Sum: "+ sum );

	}

}
