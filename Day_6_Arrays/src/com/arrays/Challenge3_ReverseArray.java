package com.arrays;

import java.util.*;

public class Challenge3_ReverseArray{

public void reverse() {
	Scanner input = new Scanner(System.in);
	System.out.println("How money numbers would you like to enter: ");
	
	int numofinput = input.nextInt();
	int[] numbers = new int[numofinput];
	System.out.println("Enter  " + numofinput + "  Random numbers");
	for (int i = 0; i < numofinput; i++) {
		System.out.println("Plesae enter the random number " + i + " :");
		numbers[i] = input.nextInt();
	}
	System.out.print("the numbers ypou entered are (non-reversed) :" + " ");
	for (int i = 0; i < numofinput; i++) {
		System.out.print(numbers[i]+ " ");
	}
	System.out.println();
	System.out.print("The random numbers you entered are (reversed)" + " ");
	for (int i = numofinput-1; i>=0; i--) {
		
		
		System.out.print(numbers[i] +  " ");
	}
}
public static void main(String [] args) {
	Challenge3_ReverseArray scan= new Challenge3_ReverseArray();
	scan.reverse();
	
	
}
}