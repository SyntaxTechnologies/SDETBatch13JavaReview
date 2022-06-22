package com.syntax.class21;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new
                Dog("Tom","Red","German",25);

        dog.printInfo();

        Cat cat=new Cat("Sasha","green","ragDoll",10);
        cat.printInfo();
    }
}
