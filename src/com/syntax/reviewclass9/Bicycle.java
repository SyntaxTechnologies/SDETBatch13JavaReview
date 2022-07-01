package com.syntax.reviewclass9;

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
        System.out.println(bike);
    }
}