package com.daa.prac;

public abstract class SelectionSort_2 { //unstable sorting algorithm

	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		intSelectionSort(intArray );
		
		System.out.println("sorted array");
		for(int a : intArray) {
			System.out.print(a + " ");
		}
	}

	private static void intSelectionSort(int[] intArray) {
		int largest = 0;
		for(int lastUnsortedArrayIndex = intArray.length - 1; lastUnsortedArrayIndex > 0; lastUnsortedArrayIndex --) {
			largest = 0;
			for(int i = 0; i <= lastUnsortedArrayIndex; i++) {
				if(intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			swap(intArray, largest, lastUnsortedArrayIndex);
		}
	}

	private static void swap(int[] intArray, int i, int j) {
		if(i == j) {
			return;
		}

		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}
}
