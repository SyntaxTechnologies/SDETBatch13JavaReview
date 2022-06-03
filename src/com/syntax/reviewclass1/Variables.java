package com.syntax.reviewclass1;

import java.math.BigInteger;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Break till 8:45
		String a="10";
		String b="20";
		//System.out.println(a*b);
		//boxes to store numbers without decimal places
		byte smallestBox=127; //-128 to 127
		short slightlyLargeBox=16665; //-32768 to 32767
		int famousBox=21455555; // most of the time you guys will use this box to store whole number
		long notThatFamousBox=4545454545454l;
		BigInteger i=new BigInteger("11225222252222222222222222222222222222222222222222222222222222222222222");
		float f=12.5555552225552225552227777f;
		double d=12.5555552225552225552227777;
		System.out.println(f);
		System.out.println(d);
		
		float f1=10.0f/3.0f;
		double d1=10.0/3.0;
		System.out.println(f1);
		System.out.println(d1);
		
		// always for whole numbers use int data type and for decimal numbers use double datatype
		char letter='a';
	System.out.println(letter);
	String name="Naveed";
	String address="house # 5, Flat # 3,street 121 ";
	
	// System.out.println('\uD83D\uDE40');
	boolean areYouHungry=true;
	}

}
