package com.arrays;

import java.util.*;

public class Challenge1_asc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please specify the size of the array:  ");
		int numofinput = input.nextInt();
		int[] numbers = new int[numofinput];
		System.out.println("Enter  " + numofinput + "  Random numbers");
		for (int i = 0; i < numofinput; i++) {
			System.out.println("Plesae enter the random number " + i + " :");
			numbers[i] = input.nextInt();
		}
		System.out.println("The random numbers you entered are (ascending order) ");
		for (int i = 0; i < numofinput; i++) {

			Arrays.sort(numbers);
			// Collections.reversed();
			System.out.println(numbers[i]);
		}
	}

}
