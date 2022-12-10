package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class minElementChallenge {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		int count =0;
		readIntegers(count);

		
//		int[] array= readIntegers(count); 
//		findMin(array);                        >>>>>>>>>>this fn is throwing an error
	
	}
	
	public static int[] readIntegers(int count) {
		Scanner input = new Scanner(System.in);
	     count = input.nextInt();
		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the" + " " + (i + 1) + " " + "element");
			array[i] = input.nextInt();
		
		}
		input.close();
		System.out.println("\nThe original array is: ");
		System.out.println(Arrays.toString(array));
		
		return array;
		
	}

	public static void findMin(int[] array) {
		int count=0;
		readIntegers(count);
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] < min)
				min = array[i];
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("The smallest number is:" + min);
		System.out.println("The largest number is:" + max);
		
	}
	
	
}

