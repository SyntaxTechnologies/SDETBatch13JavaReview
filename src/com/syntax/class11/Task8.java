package com.syntax.class11;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		// 0 1 1 2 3 5 8 13 21
		int previousNumber=0;
		int currentNumber=1;
		int nextNumber=0;
		int numbersToPrint=10;
		System.out.print(0+" ");
		System.out.print(1+" ");
		
		for(int i=0; i<numbersToPrint-2;i++) {
			nextNumber=previousNumber+currentNumber;
			System.out.print(nextNumber+" ");
			previousNumber=currentNumber;
			currentNumber=nextNumber;
			
		}
		

	}

}
