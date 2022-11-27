package com.challenge1;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// gets array size from the user
		System.out.println("Please enter array size");
		int size = in.nextInt();

		int[] arrayNum = getIntiger(size);
		int[] sortedArray = sortIntiger(arrayNum);
		printArray(sortedArray);

	}

	public static int[] getIntiger(int size) {
		Scanner in = new Scanner(System.in);

		// get elements from user
		int getNum[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter intiger elements");
			getNum[i] = in.nextInt();
		}

		return getNum;
	}

	public static void printArray(int[] arr) {
		System.out.println("Sorted numbers");

		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}

	public static int[] sortIntiger(int[] arrayNum) {
		System.out.println("Your numbers");
		
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println(arrayNum[i]);

		}
		int temp;
		for (int i = 0; i < arrayNum.length; i++) {
			for (int j = i; j < arrayNum.length; j++) {

				if (arrayNum[i] < arrayNum[j]) {
					temp = arrayNum[i];
					arrayNum[i] = arrayNum[j];
					arrayNum[j] = temp;

				}
			}

		}
		return arrayNum;
	}
}
