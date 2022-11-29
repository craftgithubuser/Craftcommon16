package com.element;

import java.util.Arrays;
import java.util.Scanner;

public class Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the count of integers ");
		int count = sc.nextInt();

		System.out.println("Enter the numbers ");
		int[] ar = new int[count];
		for (int i = 0; i < count; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println("The elements in the Array are: " + Arrays.toString(ar));

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
			
		}
			System.out.print("The minimum  element in the Array is :   " + min);
		

		
	}

}
