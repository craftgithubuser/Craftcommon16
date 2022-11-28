package com.practice;

public class ArrayDemo3 {
	public static void main(String[] args) {
		
		double studMark[] = {85,9,78,90,75,97,67,8,70,50,89};
		//write a code total sum and average
		
		double total=0,average;
		int len =studMark.length;
		
		for(int i=0; i<len; i++) {
			total += studMark[i]; // total = total+studMark[i]
		}
		
		average= total /(double)len;
		
		System.out.println("Total mark of Student: " + total);
		System.out.println("Average mark of Student: " + average);
		}
	}


