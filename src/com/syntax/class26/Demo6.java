package com.syntax.class26;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        int num3=10;
        int num4=10;
        int num5=10;
        System.out.println(num1+num2+num3+num4+num5);
        // whenever we have to store more than three values of same type which are
        // also logically connected we should create an array for them
        String name="AbdulSamad";
        String name2="Kat";
        String nam3="Adam";
        String nam4="Bilal";
        String [] names={"AbdulSamad","Kat","Adam","Bilal"};

        // not a good fit for an array because data is not same logically
        String name5="James";
        String address="New york";
        String movieName="Thor";

        String[] arr={"James","New york","Thor"};

        Object []array={10,51.2,"Asghar"}; // very bad idea to use this object array to store all teh elements



    }
}
