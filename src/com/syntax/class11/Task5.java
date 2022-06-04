package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a 2D array of integers.
		// Develop a program which will calculate
		// the sum of even and odd numbers for that array.

		//Break till 11:45
		int[][] arr = { { 10, 15, 10 }, { 20, 50, 20 }, { 30, 30, 30 } };
		int evenSum = 0;
		int oddSum = 0;

		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr[j].length; i++) {
				if (arr[j][i] % 2 == 0) {
					evenSum = evenSum + arr[j][i];
				} else {
					oddSum = oddSum + arr[j][i];
				}
			}

		}
		System.out.println("Odd Sum " + oddSum);
		System.out.println("Even Sum " + evenSum);
	}

}
