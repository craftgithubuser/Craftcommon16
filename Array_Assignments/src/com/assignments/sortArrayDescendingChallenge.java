package com.assignments;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sortArrayDescendingChallenge {

	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = input.nextInt();
		Integer[] arrayDesc = new Integer[size];
		for (int i = 0; i < arrayDesc.length; i++) {
			System.out.println("Enter the" + " " + (i + 1) + " " + "element");
			arrayDesc[i] = input.nextInt();

		}
		input.close();

		System.out.println("\nThe original array is: ");
		System.out.println(Arrays.toString(arrayDesc));

		System.out.println("\nThe sorted array is: ");
		Arrays.sort(arrayDesc, Collections.reverseOrder());
		System.out.print(Arrays.toString(arrayDesc) + " ");
	}
	public static int readIntegers(int count) {
		try (Scanner input = new Scanner(System.in)) {
			int size = input.nextInt();
			 int [] arrayDesc = new int[size];
				for (int i = 0; i < arrayDesc.length; i++) {
					System.out.println("Enter the" + " " + (i + 1) + " " + "element");
					arrayDesc[i] = input.nextInt();
					count = arrayDesc[i];
}
		}
		 return count;
	}

}
