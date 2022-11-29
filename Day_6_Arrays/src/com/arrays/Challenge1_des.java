package com.arrays;

import java.util.*;

public class Challenge1_des {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please specify the size of the array:  ");
		int numofinput = input.nextInt();
		int[] numbers = new int[numofinput];
		int con=0;
		System.out.println("Enter  " + numofinput + "  Random numbers");
		for (int i = 0; i < numofinput; i++) {
			System.out.println("Plesae enter the random number " + i + " :");
			numbers[i] = input.nextInt();
		}
		for (int i=0; i<numofinput;i++) {
			for (int j=i; j<numofinput; j++) {
				if (numbers[i]<numbers[j]) {
					con=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=con;
					
				}
			}
		}
		System.out.println("The random numbers you entered are");
		for (int i = 0; i < numofinput; i++) {

			//Arrays.sort(numbers);
			// Collections.reversed();
			System.out.print(numbers[i] + " ");
		}
	
	}

}
