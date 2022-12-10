package com.oopsEncapsulation;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st= new Student();
		
		System.out.println("Student first name:" +" " +st.getFirstname());
		System.out.println("Student last name:" +" "  +st.getLastname());
		System.out.println("Student age:" + " " +st.getAge());
		System.out.println("Student college:" + " "+st.getCollege());
	}

}
