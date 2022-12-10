  package com.collection.day11;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList<>();
		list.add("james");
		list.add(10);
		list.add('A');
		list.add(0,"jamie");
	//	list.remove("jamie");
		
	//	System.out.println(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("\n");
		
		for (int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
