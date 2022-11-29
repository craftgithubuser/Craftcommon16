package setterDemoJava;

import com.oopsEncapsulation.GetterSetter;

public class SetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetterSetter Gs= new GetterSetter();
		
		Gs.setFirstname("Hilina");
	    Gs.setLastname("Asnake");
	    Gs.setAge(28);
	    Gs.setCollege("Oxford");
	    
	    System.out.println("Student first name:" +" " +Gs.getFirstname());
		System.out.println("Student last name:" +" "  +Gs.getLastname());
		System.out.println("Student age:" + " " +Gs.getAge());
		System.out.println("Student college:" + " " +Gs.getCollege());
	}

	}

