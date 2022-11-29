package com.Reverse;

import java.util.Scanner;

public class Reverse_A {
	public static void main(String[] args) {		
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the count of integers ");
		int count = sc.nextInt();

		System.out.println("Enter the numbers ");
		int[] ar = new int[count];
		for (int i = 0; i < count; i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.print(" Array : ");

		for(int i = 0; i < count; i++)
	      {
	         System.out.print( ar[i]+" " );
	      }
		System.out.println();
		System.out.print(" Reverse Array : ");

	      for(int i = count - 1; i >= 0; i--) 
	      {  
	         System.out.print( ar[i]+" " );  
	      }
		
	}

	



}




