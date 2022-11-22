package com.loop;

public class ReturnClass {
	
	public enum vowel{}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnClass r = new ReturnClass();
		
		

		for (int i = 25; i <= 31; i++)

			r.checkEvent(i);

	}

	public boolean checkEvent(int a) {

		if (a % 2 == 0) {
			System.out.println(a + ": is even number ");
			return true;
		}
		System.out.println(a + ": is odd number ");
		return false;
	}

}
