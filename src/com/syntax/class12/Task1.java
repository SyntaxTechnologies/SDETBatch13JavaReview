package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String userName="admin";
		String password="Password1234";
		String confirmPassword="Password1234";
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("Password cannot contain username");
		} else if(!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
		
		
		
	}

}
