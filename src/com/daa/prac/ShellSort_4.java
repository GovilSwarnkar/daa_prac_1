package com.daa.prac;

public class ShellSort_4 {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		intShellSort(intArray);

		System.out.println("sorted array : ");
		for (int a : intArray) {
			System.out.print(a + " ");
		}
	}

	private static void intShellSort(int[] intArray) {
		int j = 0;
		int key = 0;
		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < intArray.length; i++) {
				key = intArray[i];
				j = i;
				while (j >= gap && intArray[j - gap] > key) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}
				intArray[j] = key;
			}
		}
	}
}
