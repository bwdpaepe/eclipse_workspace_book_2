package ui;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(doubleArray);
		int[] filledIntArray = new int[10];
		
		int[] intArray = {1, 2, 3, 4, 5, 6};
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		
		int[] array1= {1,2,3,4,5};
		int[] array2= {1,2,3,4,5};
		
		System.out.println(array1 == array2);
		System.out.println(array1.equals(array2));
		System.out.println(Arrays.equals(array1, array2));
		
		

	}

}
