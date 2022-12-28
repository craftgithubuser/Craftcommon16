package com.pojoday12;

import java.util.*;


public class EmployeeMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		ArrayList <Employee> list = new  ArrayList<Employee>();

		HashMap<Integer,Employee> hs =new HashMap<Integer, Employee>();
		
		Employee emp1 = new Employee();
		emp1.setEmpId(100);
		emp1.setEmpName("Hanif");
		emp1.setEmpSalary(30000.56);
		
//		list.add(emp1);
		hs.put(101, emp1);
		
		Employee emp2 = new Employee();
		emp2.setEmpId(200);
		emp2.setEmpName("Adel");
		emp2.setEmpSalary(15000.65);
		
//		list.add(emp2);
		hs.put(102, emp2);
		
//		System.out.println(emp1.getEmpId()+ " " + emp1.getEmpName()+" " +emp1.getEmpSalary() );
//		System.out.println(emp2.getEmpId()+ " " + emp2.getEmpName()+" " +emp2.getEmpSalary() );
	
//		for(Employee elt: list) {
//			System.out.println(elt.getEmpId()+ " " + elt.getEmpName()+" " +elt.getEmpSalary() );
		 
		Set s = hs.entrySet();
		  Iterator it = s.iterator();
		  
		  while (it.hasNext()) {
			  
		  
		  Map.Entry me = (Map.Entry)it.next();
		  System.out.print(me.getKey()+ " ");
		  Employee el =(Employee) me.getValue();
		  System.out.println(el.getEmpId() + " " + el.getEmpName()+ " " + el.getEmpSalary());
			
		
			
		}
		
		
	}

}