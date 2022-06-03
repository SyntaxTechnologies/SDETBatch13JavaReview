package com.syntax.reviewclass2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter your age");
		int age=scanner.nextInt(); // user enters the number and hits the enter key
		
		scanner.nextLine(); // consumes the enter that user press after the number
		
		System.out.println("Please Enter your name");
		String name=scanner.nextLine();
		
		System.out.println(age+name);
		
		
		// Break till 8:45
		
		
	}

}
