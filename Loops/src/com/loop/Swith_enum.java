package com.loop;

public class Swith_enum {

	public enum vowel {a, e, o, i, u}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vowel[] character = vowel.values();

	// for each loop used to access array elements
		for (vowel Now : character) {

			switch (Now) {

			case a:
				System.out.println("'a' is vowel");
				break;

			case e:
				System.out.println("'e' is vowel");
				break;

			case o:
				System.out.println("'o' is vowel");
				break;

			case i:
				System.out.println("'i' is vowel");
				break;

			case u:
				System.out.println("'u' is vowel");
				break;

			default:
				System.out.println("constant number");

			}
		}
	}

}
