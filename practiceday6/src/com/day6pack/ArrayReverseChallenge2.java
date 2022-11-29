package com.day6pack;

import java.util.Scanner;

public class ArrayReverseChallenge2 {

 // public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] descintegers = getIntegers(5);
		int[] sorted = sortIntegers(descintegers );
		printArray(sorted);
	}

	public static  int[] getIntegers(int numbers) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer values:" + numbers);
		int[] array = new int[numbers];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
scanner.close();
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Index " + i + " value " + array[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}

		boolean sorted = true;
		int temp;
		while (sorted) {
			sorted = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					sorted = true;
				}
			}
		}

		return sortedArray;
	}
}
