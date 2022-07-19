package com.syntax.reivewclass10;

public class FlowerTester {
    public static void main(String[] naveed) {
        Rose rose=new Rose("Red");
        rose.showColor();
        rose.bloom();
        rose.smell();
        rose.thorns();

        System.out.println("************");
        Flower flower=new Rose("Green");
        flower.showColor();
        flower.bloom();
        flower.smell();
        Rose rose1=(Rose)flower;
        rose1.thorns();
      //  flower.thorns(); not possible
        Flower[] flowers={new Rose("Red"),new Tulips("Pink")};
        System.out.println("************");
        for (Flower flower1 : flowers) {
            flower1.bloom();
            flower1.smell();
        }

        main("Katerina got confused");

    }

    public static void main(String args) {
        System.out.println("Hehhhe got confused");
    }
}
