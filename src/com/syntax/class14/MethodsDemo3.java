package com.syntax.class14;

public class MethodsDemo3 {

	//Write a method that takes an int value if that value is even this method
	// returns true otherwise it returns false
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo3 md=new MethodsDemo3();
		System.out.println(md.isEven(3));
		System.out.println(md.checkString("hello"));
	}
	
	//write a method that takes a String and returns true if number of characters in that String
	// are even otherwise odd
	
	boolean checkString(String str) {
		
		if(str.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean isEven(int number) {
		
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
