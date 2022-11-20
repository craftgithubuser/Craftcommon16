package typesofVarables;

public class StaticVarable {
	
	public static double salary;
	public static String dept="Finance";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	StaticVarable.salary=1000;
	System.out.println("Dept:"+StaticVarable.dept);
	System.out.println("salary:"+StaticVarable.salary);
	
}
}
