package com.syntax.class18;

public class Cat {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    public Cat(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void print(){
        System.out.println(name);
    }
}
