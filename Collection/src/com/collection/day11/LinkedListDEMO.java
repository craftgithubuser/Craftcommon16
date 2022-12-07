package com.collection.day11;

import java.util.*;

public class LinkedListDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating LinkedList
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//adding element to ArrayList
		linkedList.add("Delhi");
		linkedList.add("NewYork");
		linkedList.add("moscow");
		linkedList.add("Dubai");
		
		//Displaying LinkedList
		System.out.println(linkedList);
		
		for (String elt:linkedList) {
			System.out.println(elt);
		}
	}

}
