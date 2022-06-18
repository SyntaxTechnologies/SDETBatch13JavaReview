package com.syntax.class19;

public class Task6 {
    /*
    Write a java class that have 4 constructors with 4
    different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 -
    from different class inside different package  and observe result
     */
   private Task6(){
        System.out.println("private");
    }

     Task6(String name){
        System.out.println("default");
    }

   protected Task6(int num){
        System.out.println("protected");
    }

    public Task6(boolean flag){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task6();
        new Task6("lovely Zombie");
        new Task6(15);
        new Task6(true);
    }

}
