package com.syntax.class11;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {10,20,5,6,8,200};
		
		int maxNumber=arr[0];    //10 
		int secondLargest=arr[0];  //10
		for(int num:arr) {
			
			if(num>maxNumber) {
				secondLargest=maxNumber;
				
				maxNumber=num;
				
			}
			if(num>secondLargest&& secondLargest<maxNumber&& num<maxNumber) {
				secondLargest=num;
			}
			
		}
		
		System.out.println(maxNumber);
		System.out.println(secondLargest);
	}

}
