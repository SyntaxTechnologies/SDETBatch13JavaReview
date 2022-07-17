package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;

public class MapDemo6 {
    public static void main(String[] args) {
        //how can we remove the elements from a map bases on the values
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0); //auto upcasting does not work with wrappers
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",10.2);
        fruit.put("Peach",10.5);
        Collection<Double> values=fruit.values();
        values.removeIf(value-> value>10.2);
        System.out.println(fruit);

    }
}
