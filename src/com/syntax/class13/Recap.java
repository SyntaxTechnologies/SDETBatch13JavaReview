package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Batch 13 is great but i say this to every batch. i was kidding";
		int len=str.length();
		System.out.println(str.toUpperCase());
		str=str.toUpperCase();
		System.out.println(str);
		str=" ";
		System.out.println(str.isEmpty());
		
		String str2=" Tara             ";
		System.out.println(str2.trim());
		str="Batch 13 is great but i say this to every batch. i was kidding";
		System.out.println(str.contains("z"));
		System.out.println(str.startsWith("Batch"));
		System.out.println(str.endsWith("ing"));
		
		
		
		
		
		
	}

}
