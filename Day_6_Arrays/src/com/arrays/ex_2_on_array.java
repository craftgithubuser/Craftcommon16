package com.arrays;

public class ex_2_on_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double studmark[] = {85,78,90,75,97,96,93,95,99};
		double total =0, average;
		int len = studmark.length;
		for(int i=0; i<len;i++) {
		total += studmark[i];
		
		}
		average = total/len;
		System.out.println(total);
		System.out.println(average);
	}

}
