package ArrayAray;

public class Assignment01Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]={62,25,32,10,82,22,52,73,100,102};
		
		int temp;
		for(int i=0;i<age.length;i++) {
			for(int j=i;j<age.length;j++) {
				if(age [i]<age[j]) {
					temp=age[i];
					age[i]=age[j];
					age[j]=temp;	
					
				}
			}
		}
		for(int a: age) {
			System.out.println(a);
		
	}
	}
}
		
		

	


