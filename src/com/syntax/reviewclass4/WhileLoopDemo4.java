package com.syntax.reviewclass4;

import java.util.Scanner;

public class WhileLoopDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// take the input form the user using scanner 
		// increment it by 2 print it 
		// if value is 10 terminate the program
		//break till 8:40
		
		
	//starting point
		int x=0;
		Scanner scanner=new Scanner(System.in);
		while(x!=10) {
			System.out.println("Please enter the number");
			x=scanner.nextInt();
			System.out.println(x+2);
		}
		
	}

}
