package com.day6pack;

import java.util.Scanner;

public class ArraysReverseChallenge {

	public static void main(String[] args) {
		System.out.println("Get integers");
		int[] challengeArray = getIntegers(5);

		System.out.println("Sort integers ");
		int[] sortedArray = sortIntegers(challengeArray);

		System.out.println(" Print array ");
		printArray(sortedArray);
	}
	

	public static int[] getIntegers(int number) {
		Scanner s = new Scanner(System.in);

		int[] values = new int[number];
		for (int i = 0; i < values.length; i++) {
			System.out.println("Enter value of index" + i);
			values[i] = s.nextInt();
		}

		s.close();
		return values;
	}
	

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("element of the array" + i + " " + array[i]);
		}
	}

	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}

		int temp;
		boolean sorted = false;
		while (sorted == false) {
			sorted = true;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;

					sorted = false;
				}
			}
		}
		return sortedArray;
	}

}
