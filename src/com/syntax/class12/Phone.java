package com.syntax.class12;

public class Phone {

	String model;
	String make;
	double screenSize;
	int RAM;
	int storage;
	int camera;
	
	
	void call() {
		System.out.println("calling someone");
	}
	
	void takePicture() {
		System.out.println("use my camera app to take pictures");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone s22Ultra= new Phone();
		s22Ultra.make="Samsung";
		s22Ultra.model="Samsung galaxy s22 ultra";
		s22Ultra.screenSize=6.8;
		s22Ultra.RAM=12;
		s22Ultra.camera=108;
		s22Ultra.storage=512;
		System.out.println(s22Ultra.storage);
		s22Ultra.call();
		
		
	}
	
	
	

}
