package com.syntax.reviewclass2;

public class IfElseDemo4 {
	public static void main(String[] args) {

		double money = 1000;
		boolean amIFree = true;

		if (false) {
			System.out.println("inside the most outer if condition");
			if (true) {
				System.out.println("Go watch a movie");
				if (false) {
					System.out.println("Line1");
				}
			}

		}
	}

}
