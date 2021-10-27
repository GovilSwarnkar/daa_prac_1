package com.daa.prac;

public class InsertionSort_3 { //unstable algorithm

	public static void main(String[] args) {
		int[] intArray = { 22, 35, -15, 7, 55, 1, -22 };
		
		intInsertionSort(intArray);
		
		System.out.println("sorted array : ");
		for(int a : intArray) {
			System.out.print(a +" ");
		}
	}

	private static void intInsertionSort(int[] intArray) {
		int key = 0;
		int i = 0;
		for(int firstUnsoredIndex = 1; firstUnsoredIndex < intArray.length; firstUnsoredIndex ++) {
			key = intArray[firstUnsoredIndex];
			for(i = firstUnsoredIndex ; i > 0 && intArray[i - 1] > key; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = key;
		}
		
	}
}
