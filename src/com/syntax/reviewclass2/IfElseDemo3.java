package com.syntax.reviewclass2;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sonia=new Scanner(System.in); // allows you to take the input from the keyboard
		System.out.println("Please Enter your Account balance");
		double accountBalance=sonia.nextDouble();
		System.out.println("Please enter the amount that you want to lend to your friend");
		double amountToLend=sonia.nextDouble();
		
		if(accountBalance>=amountToLend) {
			System.out.println("Yes i can help you");
		}else {
			System.out.println("Sorry i don't have enough money to help you");
		}
		
		
	}

}
