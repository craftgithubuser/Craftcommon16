package PolymorphimDemos;

public class PolyExcer1 {

	
	// method without parameter
	//  public void display() {
	   // for (int i = 0; i < 10; i++) {
	  //    System.out.print(" * ");
	  //  }
	//  }

	  // method with single parameter
	  public void display(char symbol) {
	    for (int i = 0; i < 10; i++) {
	      System.out.print(symbol);
	    }
	  }
	

	//public class Main {
	 public static void main(String[] args) {
		PolyExcer1 d1 = new PolyExcer1();

	    // call method without any argument
	   // d1.display();
	    System.out.println("\n");

	    // call method with a single argument
	    d1.display('#');
	  }
	}


