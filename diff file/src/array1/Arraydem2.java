package array1;

public class Arraydem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double studMark[] = {85.9,78,90,75,97,67,80,70,50,98};
		
		//write a code that will print the total sum and average of student mark.
		double total =0,averge =0;
		
		int len = studMark.length;
		
		for(int i =0; i<len;i++) 
		{
			total = total+ studMark[i];
			averge = total/(double)len;
		}
		System.out.println("total mark of studmark:" + total);
		System.out.println("averge mark of studmark:" + averge);
		

	}

}
