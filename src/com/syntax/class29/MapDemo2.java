package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> fruit=new TreeMap<>();
        fruit.put("Apple",20);
        fruit.put("Water melon",25);
        fruit.put("Peach",20);
        fruit.put("Strawberry",100);



        HashMap<String,Integer> cosmetics=new HashMap<>();
        cosmetics.put("foundation",20);
        cosmetics.put("lipstick",25);
        cosmetics.put("mascara",20);
        cosmetics.put("Blush",100);

        LinkedHashMap<String,Integer> groceries=new LinkedHashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(cosmetics);
        System.out.println(groceries);

    }
}
