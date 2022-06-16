package com.syntax.class18;

public class ThisKeywordDemo {
    String name="instance";
    void printName(){
        String name="local";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisKeywordDemo t=new ThisKeywordDemo();
        t.printName();
    }
}
