package com.day6pack;

import java.util.Scanner;

public class MinElementChallenge {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = readInteger();
		int[] array = readElements(number);
		int minNumber = findMin(array);
		System.out.println("The min number is " + minNumber);

	}

	private static int readInteger() {
		System.out.println("Enter count:");
		int number = scanner.nextInt();
		scanner.nextLine();
		return number;
	}

	private static int[] readElements(int number) {
		// TODO Auto-generated method stub
		int[] values = new int[number];

		for (int i = 0; i < number; i++) {
			System.out.println("Please enter index element:" + i);
			values[i] = scanner.nextInt();
			scanner.nextLine();
		}

		return values;
	}

	private static int findMin(int[] array) {
		int minNumber = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < minNumber) {
				minNumber = array[i];
			}
		}

		return minNumber;

	}

}
