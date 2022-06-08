package com.syntax.class13;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that reads two people's first
	names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
		 */
		String father="Sameer";
		String mother="Taylor swift";
		boolean boy=false;  //if true boy otherwise girl
		
		if(boy) {
			String firstHalf=father.substring(0,father.length()/2);
			String secondHalf=mother.substring(mother.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}else {
			String firstHalf=mother.substring(0,mother.length()/2);
			String secondHalf=father.substring(father.length()/2);
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}
		
		
	}

}
