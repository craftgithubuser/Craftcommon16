package com.arrays;

import java.util.*;

public class test {

	public void findmin() {
		Scanner input = new Scanner(System.in);

		System.out.println("Please specify the size of the array:  ");
		int numofinput = input.nextInt();
		int[] numbers = new int[numofinput];
		System.out.println("Enter  " + numofinput + "  Random numbers");
		for (int i = 0; i < numofinput; i++) {
			System.out.println("Plesae enter the random number " + i + " :");
			numbers[i] = input.nextInt();
		}
		System.out.print("The numbers you enterd are :");
		System.out.print("");
		for (int i = 0; i < numofinput; i++) {
			System.out.print(numbers[i] + " ");

		}
		int lar = numbers[0];

		for (int i = 0; i < numofinput; i++) {
			if (numbers[i] < lar)
				lar = numbers[i];
		}
		System.out.println();
		System.out.print("The min numbers is :" + lar);

		int min = numbers[0];

		for (int i = 0; i < numofinput; i++) {
			if (numbers[i] > min)
				min = numbers[i];
		}
		System.out.println();
		System.out.print("The min numbers is :" + min);

	}

	public static void main(String[] args) {
		test t = new test();
		t.findmin();
	}
}
