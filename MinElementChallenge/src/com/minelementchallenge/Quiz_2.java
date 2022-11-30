package com.minelementchallenge;

import java.util.Scanner;

public class Quiz_2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the length of Integers: ");
		int count = input.nextInt();
		int[] arr = readIntegers(count);
		System.out.println("Minimum integer in the array:" + findMin(arr));
	}

	public static int[] readIntegers(int count) {
		int[] integers = new int[count];
		System.out.printf("Enter %d integers here: ", count);

		for (int i = 0; i < count; i++) {
			integers[i] = input.nextInt();
		}

		return integers;

	}

	public static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}
}