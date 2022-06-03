package com.syntax.reviewclass2;

public class StringConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Ali";
		String lastName="Baba";
		String fullName=firstName+lastName;
		int num=10;
		int num2=10;
		System.out.println(fullName);
		System.out.println(firstName+num);
		System.out.println(firstName+num+num2); //Ist Operation=firstName+num=>Ali10+10=>Ali1010
		System.out.println(firstName+(num+num2)); //Ist operation=(num+num2)=>10+10=>Ali+20=>Ali20
		System.out.println(num+firstName+num2); //10+Ali=>10Ali+10=>10ALi10

	}

}
