package com.syntax.class28;


import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {

        ArrayList<Flower> flower=new ArrayList<>();
        flower.add(new Rose());
        flower.add(new Lilly());
        flower.add(new Flower());

        for (Flower flower1 : flower) {
            flower1.bloom();
        }



    }
}

class Flower{
    void bloom(){
        System.out.println("Generally flower in spring");
    }
}
class Rose extends Flower
{
    void bloom(){
        System.out.println("bloom in April");
    }
}

class Lilly extends Flower
{
    void bloom(){
        System.out.println("bloom in Summer");
    }
}
