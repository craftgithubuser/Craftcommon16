package com.arrays;

import java.util.*;

public class Challanege2_findmin {

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
		int min = numbers[0];

		for (int i = 0; i < numofinput; i++) {
			if (numbers[i] < min)
				min = numbers[i];
		}
		System.out.println();
		System.out.print("The smallest numbers is :" + min);

		int max = numbers[0];

		for (int i = 0; i < numofinput; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		System.out.println();
		System.out.print("The largest numbers is :" + max);

	}

	public static void main(String[] args) {
		Challanege2_findmin t = new Challanege2_findmin();
		t.findmin();
	}
}
