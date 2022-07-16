package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo5 {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Orange");
        System.out.println(fruit);

        System.out.println("****************");
        Iterator<String> iterator= fruit.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("****************");

        for(String frt:fruit){
            System.out.println(frt);
        }
    }
}
