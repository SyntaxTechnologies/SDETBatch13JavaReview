package com.syntax.reivewclass10;

public abstract class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    abstract void park();
    void start(){
        System.out.println("use keys to start me");
    }
}
class BMW extends Car{
    public BMW(String make, String model) {
        super(make, model);
    }

    @Override
    void park() {
        System.out.println("use my auto parking mode to park me");
    }
}
