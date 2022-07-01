package com.syntax.reviewclass9;

import java.util.Objects;

public class Bicycle {
    String make;
    int gears;
    int maxSpeed;

    public Bicycle(String make, int gears, int maxSpeed) {
        this.make = make;
        this.gears = gears;
        this.maxSpeed = maxSpeed;
    }

    void ride(){
        System.out.println("Its time to ride Bicycles");
    }
    void applyBreaks(){
        System.out.println("Applying brakes");
    }

    // type toString and select the second option to generate this method automatically
    @Override
    public String toString() {
        return "Bicycle{" +
                "make='" + make + '\'' +
                ", gears=" + gears +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicycle)) return false;
        Bicycle bicycle = (Bicycle) o;
        return gears == bicycle.gears && maxSpeed == bicycle.maxSpeed && Objects.equals(make, bicycle.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, gears, maxSpeed);
    }
}
class MountainBikes extends Bicycle{
    boolean suspension=true;
    int seatHeight;

    public MountainBikes(String make, int gears, int maxSpeed,int seatHeight) {
        super(make, gears, maxSpeed);
        this.seatHeight=seatHeight;
    }

    void setSeatHeight(int seatHeight){
        this.seatHeight=seatHeight;
    }


}

class Test{
    public static void main(String[] args) {
        Bicycle bike=new Bicycle("TREK",4,30);
        Bicycle bike2=new Bicycle("TREK",4,30);
        System.out.println(bike==bike2); // we should never use == to compare non-primitive data types
        System.out.println(bike.equals(bike2));
        String name=new String("Hamid");
        String name2=new String("tara");
        System.out.println(name.equals(name2));
       // System.out.println(bike);
    }
}