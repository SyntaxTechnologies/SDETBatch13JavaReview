package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {


        List<String> names=new ArrayList<>();
        names.add("bro");
        names.add("Abdul");
        names.add("Mumtaz");
        names.add("Zameer");
        names.add("Cindy");


        // those operatoim which can change the sie of collection are not allowed to be used inside loops
   /*     for (String name:names){

            if(name.contains("B")){
                names.remove(name);
            }
        }*/

        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
