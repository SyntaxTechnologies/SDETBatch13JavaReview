package com.syntax.reivewclass10;



public class Flower {
    String color;
    Flower(String color){
        this.color=color; // we can use this keyword to distinguish a local and instance variable
    }
    Flower(int color){
       // we can use this keyword to distinguish a local and instance variable
    }
    void showColor(){
        System.out.println("Flowers have beautiful colors");
    }
    void smell(){
        System.out.println("Flowers smell very good");
    }
    void bloom(){
        System.out.println("Generally bloom in Spring");
    }
    public static void main(String[] args) {

    }
}

class Rose extends Flower{

    public static void main(String[] args) {

    }
    Rose(String color) {
        super(color);
    }

    void showColor(){
        System.out.println("Roses have "+color+" Colors");
    }
    void bloom(){
        System.out.println("Roses bloom in April");
    }

    void thorns(){
        System.out.println("Pleas be careful");
    }

}

class Tulips extends Flower{

    Tulips(String color) {
        super(color);
    }
    void showColor(){
        System.out.println("Tulips have "+color+" color");
    }
}
