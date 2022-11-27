package com.arrayReverse;

import java.util.Scanner;

public class ReveresArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter array size");
		int arraySize = in.nextInt();

		int[] getNum = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter element on index: " + i);

			getNum[i] = in.nextInt();

		}
		reverse(getNum);
	}

	public static void reverse(int[] arr) {

		System.out.println("Original Numbers:");

		for (int i = 1; i <= arr.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("Reversed Numbers:");

		for (int j = arr.length; j > 0; j--) {
			System.out.print(j + " ");

		}
	}

}
