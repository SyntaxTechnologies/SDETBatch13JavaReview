package com.syntax.class11;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break 1:45
		// Write a program to print out duplicate elements from an Array of Strings? this is last
		String[] arr= {"AA","B","C","A","B"};
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i].equals(arr[j])&& i!=j){
					System.out.println(arr[i]);
				}
			}
		}

	}

}
