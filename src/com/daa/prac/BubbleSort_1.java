package com.daa.prac;

public class BubbleSort_1 {  //stable sort algorithm   

	public static void main(String[] args) {
		int[] intArray = {-1, 2, -1, 4, 9, 8};
		
		intSort(intArray);
		
		System.out.println("sorted array : ");
		
		for(int a : intArray) {
			System.out.print(a + " ");
		}
	}
	
	public static void intSort(int[] intArray) {
		for (int i = intArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					swap(intArray, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}