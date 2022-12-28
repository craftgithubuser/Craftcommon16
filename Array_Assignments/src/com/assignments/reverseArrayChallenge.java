package com.assignments;

import java.util.*;


public class reverseArrayChallenge {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = input.nextInt();
		Integer[] revrseArray = new Integer[size];
		for (int i = 0; i < revrseArray.length; i++) {
			System.out.println("Enter the" + " " + (i + 1) + " " + "element");
			revrseArray[i] = input.nextInt();

		}
		input.close();
     
      System.out.println();
      
    System.out.println("Original Array:");
   for(int i=0;i<revrseArray.length;i++)
         System.out.print(revrseArray[i] + "  ");
     
    System.out.println("\n");
     
    System.out.println("Original Array printed in reverse order:");
         for(int i=revrseArray.length-1;i>=0;i--)
         System.out.print(revrseArray[i] + "  ");
    }
}