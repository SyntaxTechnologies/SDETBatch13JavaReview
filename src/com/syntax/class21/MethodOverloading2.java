package com.syntax.class21;

public class MethodOverloading2 {

    static void add(int number1,int number2){
        System.out.println(number1+number2);
    }

    static void add(double number1,double number2){
        System.out.println(number1+number2);
    }

    static void add(double number1,double number2,double number3){
        System.out.println(number1+number2);
    }


    static void add(int number1,int number2,int number3,int number4){
        System.out.println(number1+number2+number3+number4);
    }

    public static void main(String[] args) {
        add(20,20);


    }
}
