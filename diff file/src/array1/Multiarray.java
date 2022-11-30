package array1;

public class Multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double studMark[] =  {85,94,78,90,75,97,67,70,50,89};
		double studsMark[][]= {
				             {85,94,78,90,75,97,67,75,50,89},
				             {85,94,78,90,75,97,67,70,50,89},
				             {85,94,78,90,75,97,67,73,50,89},
				             {85,94,78,90,75,97,67,70,50,89},
				             {85,94,78,90,75,97,67,76,50,89},
		};
		//row =5,index =0-4 and column = 0-10,index =0-9
		//accessing data in multi dimentional array
		double total = 0,average = 0;
		int len = studMark.length;
		
		for(int i=0;i<studMark.length;i++) {
		 total =  total + studMark[i];
		average = total/len;
		}
		System.out.println("total mark of student:" + total);
		System.out.println("average mark of student:" + average);

	}

}
