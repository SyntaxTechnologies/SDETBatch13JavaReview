package com.syntax.class25;

public interface Animal {
    void sleep();
    void eat();

}

interface Dog extends Animal{
    void Bark();
}

class Husky implements Dog{

    @Override
    public void sleep() {
        System.out.println("Sleep 4 hours");
    }

    @Override
    public void eat() {
        System.out.println("Like to eat meat");
    }

    @Override
    public void Bark() {
        System.out.println("Dogs favourite things");
    }
}
