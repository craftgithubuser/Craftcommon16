package ArrayAray;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment2 {


		private static Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	        System.out.println("Enter count");
	        int count = scanner.nextInt();
	        int[] returnedArray = readIntegers(count);
	        System.out.println("Min is: " + findMin(returnedArray));
	    }
	    private static int[] readIntegers(int count) {
	        System.out.println("Enter " + count + " integer value.\r");
	        int[] values = new int[count];
	        for (int i = 0; i < values.length; i++) {
	            values[i] = scanner.nextInt();
	        }
	        System.out.println(Arrays.toString(values));
	        return values;
	    }
	    public static int findMin(int[] array) {
	        for (int a = 0; a < array.length; a++) {
	            for (int b = 0; b < array.length; b++) {
	                if (array[a] < array[b]) {
	                    int temp = array[b];
	                    array[b] = array[a];
	                    array[a] = temp;
	                }
	            }
	        }
	        return array[0];
	    }
	}
