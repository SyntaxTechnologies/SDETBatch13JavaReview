package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {

        HashMap<Integer,String> items=new HashMap<>();
        items.put(7664847, "Printer");
        items.put(123456, "iPhone");
        items.put(7879885, "TV");
        items.put(7664855, "Refrigerator");
        items.put(1234567, "iPad");

        for (Map.Entry<Integer,String> entry:items.entrySet()
             ) {
            System.out.println(entry);
        }

    }
}
