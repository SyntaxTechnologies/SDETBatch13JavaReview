package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}

class Wood{
    String color="Blue";
}
class Furniture extends Wood{

    String color="Black";
}
class Chair extends Furniture{
    String color="grey";
    void printColor(){
        String color="White";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
//always local variables are preferred