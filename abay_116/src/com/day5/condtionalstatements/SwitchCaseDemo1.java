package com.day5.condtionalstatements;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("pls enter today's day:");
		String today = in.next();

		switch (today) {

		case "Monday":
			System.out.println("Today is Monday");
			break;

		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;

		case "Wendsday":
			System.out.println("Today is Wendsday");
			break;

		case "Thursday":
			System.out.println("Today is Thursday");
			break;

		case "Friday":
			System.out.println("Today is Friday");
			break;

		case "Saturday":
			System.out.println("Today is Saturday");
			break;

		case "Sunday":
			System.out.println("Today is Sunday");
			break;

		default:
			System.out.println("wrong input");

		}

	}

}
