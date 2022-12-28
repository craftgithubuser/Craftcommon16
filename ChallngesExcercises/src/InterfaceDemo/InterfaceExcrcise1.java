package InterfaceDemo;
public class InterfaceExcrcise1 {
interface Polygon {
	  void getArea(int length, int breadth);
	}

	// implement the Polygon interface
	static class Rectangle implements Polygon {

	  // implementation of abstract method
	  public void getArea(int length, int breadth) {
	    System.out.println("The area of the rectangle is " + (length * breadth));
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
	    r1.getArea(5, 6);
	}

}
}