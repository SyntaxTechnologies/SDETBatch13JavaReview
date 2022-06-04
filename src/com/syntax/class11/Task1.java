package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using Scanner create an array of integer values. After the array is created,
		//calculate the sum of all stored elements in that array.
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter the size of the array that you want to create");
		int arraySize=scanner.nextInt();
		
		System.out.println("the size of the arrays is "+ arraySize);
		int [] integerArray=new int[arraySize]; //creating an array of size that will be entered by user
		//we can't use enhanced for loop for inserting or updating the values of an array
		System.out.println("Please enter "+arraySize+" elements");
		for(int i=0;i<integerArray.length;i++) {
			integerArray[i]=scanner.nextInt(); //taking the input from the user and storing it inside the array
		}
		
		System.out.println(Arrays.toString(integerArray));
		
		int sum=0;
		for(int captainAmerica:integerArray) { //advanced for loop
			sum=sum+captainAmerica; //take the elements from the array one by one and add them to the sum variable
		}
		
		System.out.println("The sum of all the elemnts is "+sum);
		
		scanner.close();
		
	}

}
