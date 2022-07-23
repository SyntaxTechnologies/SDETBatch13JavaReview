package com.syntax.class30;

import java.util.LinkedHashSet;

public class Task6 {
    /*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
  Write a logic to concatenate all string from the collection.
 */
    public static void main(String[] args) {
        LinkedHashSet<String> collection= new LinkedHashSet<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("Welcome");
        collection.add("to");
        collection.add("Syntax");

        StringBuilder allValues= new StringBuilder();
        for (String value:collection
             ) {
            allValues.append(value);
        }
        System.out.println(allValues);
    }
}
