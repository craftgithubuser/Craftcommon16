
package com.quizassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_1 {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		// get the length of the Array from user
		System.out.print("Enter the length of the Array here: ");
		System.out.println();
		int length = in.nextInt();
		int[] arr = getIntger(length);
		int[] sortedArray = sortInteger(arr);
		printArray(sortedArray);

	}

	public static int[] getIntger(int length) {

		// enlist those determined integers
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enlist the elements of the Array here: ");
			arr[i] = in.nextInt();

		}
		System.out.print("\nPut Elements in Angle Bracket: " + Arrays.toString(arr) + " ");
		System.out.println("\n");
		return arr;

	}

	public static void printArray(int[] arr) {
		// use for loop to access the array elements

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public static int[] sortInteger(int[] sortedArray) {

		// sorting numbers using sort() method
		System.out.print("Sorted in Ascendeing Order: ");
		Arrays.sort(sortedArray);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");

		}
		System.out.println("\n");
		// use swap approach for sorting in descending order
		System.out.print("Sorted in Descending Order: ");

		int temp;
		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = i; j < sortedArray.length; j++) {

				if (sortedArray[i] < sortedArray[j]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = temp;

				}
			}

		}
		return sortedArray;
	}
}
