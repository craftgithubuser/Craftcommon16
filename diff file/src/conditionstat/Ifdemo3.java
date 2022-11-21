package conditionstat;

import java.util.Scanner;

public class Ifdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("pls enter any postive number between 1 and 99999");
		int num = input.nextInt();

		if (num < 10 && num > 1) {
			System.out.println("its a one digit number");
		}

		if (num < 100 && num >= 10) {
			System.out.println("its a two digit number");

		} else if (num < 1000 && num >= 100) {
			System.out.println("its a three digit number");

		} else if (num < 10000 && num >= 1000) {
			System.out.println("its a four digit number");

		} else if (num < 100000 && num >= 10000) {
			System.out.println("its a five digit number");

		} else {
			System.out.println("number is not between 1 & 99999");
		}

	}

}
