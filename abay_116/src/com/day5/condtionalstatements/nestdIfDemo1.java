package com.day5.condtionalstatements;

public class nestdIfDemo1 {

	public static void main(String[] args) {
	
		int age = 25;
		int weight = 70;
		
		if (age >= 18) {
			
			if (weight > 50) {
				System.out.println("you are eleigible");
			}
				else {
					System.out.println("you are not eligible weight issue");
				}
		}
		else {
			System.out.println("you are not eligible Age issue");
		
			}
		}

	}


