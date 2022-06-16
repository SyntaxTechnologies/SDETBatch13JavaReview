package com.syntax.class18;

public class CarTester {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Etron GT", "Black");
        car1.printInfo();
        Car car2 = new Car("Toyota", "Camry", "White");
        car2.printInfo();

        Car car = new Car("Tesla");
        car.printCarModel();

        //Break till 8:41
    }
}
