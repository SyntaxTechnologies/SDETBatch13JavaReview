package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0); //auto upcasting does not work with wrappers
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",10.2);
        fruit.put("Peach",10.5);

        Collection<String>  keys=fruit.keySet();
        //Can't use because we are trying to change the size of Map not allowed
     /*   for(String key:keys){
            if(key.contains("e")){
                fruit.remove(key);
            }
        }*/

        keys.removeIf(key -> key.contains("e"));

/*
        Iterator<String> iterator= keys.iterator();
        while (iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }*/
        System.out.println(fruit);


    }
}
