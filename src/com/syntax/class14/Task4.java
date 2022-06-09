package com.syntax.class14;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		 */
		String str="This is sentence i want to reverse";
		String[] arr=str.split(" ");
		
		for(String s:arr) {
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		//new StringBuilder(s) object of StringBuilder is craeted
		
		System.out.println();
		//System.out.println(new StringBuilder(str).reverse());
	}

}
