package com.loop;

import java.util.Scanner;

public class SwitchClass {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int day = 0;
		String toDay;

		System.out.println("Please enter today");
		day = in.nextInt();

		switch (day) {
		case 1:
			toDay = "Today is monday";
			break;

		case 2:
			toDay = "Today is tuesday";
			break;

		case 3:
			toDay = "Today is wednesday";
			break;
			
		case 4:
			toDay = "Today is thursday";
			break;

		case 5:
			toDay = "Today is friday";
			break;

		case 6:
			toDay = "Today is saturday";
			break;
			
		case 7:
			toDay = "Today is sunday";
			break;

		default:
			toDay = "inalid day";
			break;

		}
		System.out.println(toDay);

	}

}
