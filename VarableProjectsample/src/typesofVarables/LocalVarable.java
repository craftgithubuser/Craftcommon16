package typesofVarables;

public class LocalVarable {
	
	public void methodOne() {
		int J=70;
		System.out.println("Value of J"+J);
	}
public void methodtwo( ) {
	int K=90;
			System.out.println("Value of K"+K);
}
   public static void main(String[] argus) {
	   
	   LocalVarable m1= new LocalVarable();
	   m1.methodOne();
	   m1.methodtwo();
	   
   }
}
