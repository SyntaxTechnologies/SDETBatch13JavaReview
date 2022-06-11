package com.syntax.class15;

public class VariablesDemo1 {

    String breed; //instance
    static int num=5; // static

    void printName(){
        String name="Local"; // local variable
        System.out.println(name);
    }

   static void printName2(){
        String name="Local"; // local variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariablesDemo1 v=new VariablesDemo1();
        v.printName();
        System.out.println(VariablesDemo1.num);
        VariablesDemo1.printName2();
    }
}
