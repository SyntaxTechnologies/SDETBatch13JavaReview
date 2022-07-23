package com.syntax.class28;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        /*Create a class Insurance that will have an attribute as insuranceName and unimplemented
 behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health.
Car class has it's own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.*/

        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Pet("Pectco","Happy Dogs"));
        insurances.add(new Car("AdamJ","Tesla s"));
        insurances.add(new Health("Obama Care"));

        for (Insurance insurance:insurances
             ) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }


    }
}
abstract
class Insurance{
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();
    abstract void cancelInsurance();

}
class Car extends Insurance{
String carModel;

    public Car(String insurance,String carModel) {
        super(insurance);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("2% of your car price for model"+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Car Insurance cancelled");
    }
}
class Pet extends Insurance {
String petType;

    public Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("90$ for the insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println("pet insurance cancelled");
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("300/Month");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Health Insurance cancelled");
    }
}