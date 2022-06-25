package com.syntax.class23;

public class PolyMorphismDemo1 {

    void doSomething(String name){
        System.out.println("downloading a movie from the internet "+name);
    }

    void doSomething(int num){
        System.out.println("calculating the text based on new rules");
    }
}

class PolyTester{
    public static void main(String[] args) {
        PolyMorphismDemo1 p=new PolyMorphismDemo1();
        p.doSomething(10);
    }
}
