package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName="Adem";
		String lastName=" jones";
		String fullName= firstName+lastName; // always always prefer this
		String fullName2=firstName.concat(lastName); // never use this because it can lead you to nullpointer exception
		System.out.println(fullName2);
		System.out.println(fullName);
		
		String name=" ";
		System.out.println(name.isEmpty());
		//System.out.println(name.isBlank());
		
		String captainAmerica=" ne   ver ";
		System.out.println(captainAmerica.trim());
		
	}

}
