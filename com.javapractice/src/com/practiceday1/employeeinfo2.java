package com.practiceday1;

import java.util.Scanner;

public class employeeinfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner g = new Scanner (System.in);
		
		System.out.println("pls enter your name:");
		String empname = g.next();
		
		System.out.println("pls enter your age:");
		int empage = g.nextInt();
		
		System.out.println("pls enter your salary:");
		double empsalary = g.nextDouble();
		
		System.out.println("pls enter yoyr bonus:");
		double empbonus = g.nextDouble();
		
		double emptotalsalary = empsalary + empbonus;
		
		System.out.println("employee name:" + empname);
		System.out.println("employee age:" + empage);
		System.out.println("employee salary:" + empsalary);
		System.out.println("employee bonus:" + empbonus);
		System.out.println("employee total salary:" + emptotalsalary);
		

	}

}
