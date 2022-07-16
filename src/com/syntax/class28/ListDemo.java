package com.syntax.class28;

public class ListDemo {
    public static void main(String[] args) {
        Object[] arr={"Hamid",10.2,"Name"}; // bad programming

        for(Object obj :arr){
            //instanceof is checks if a variable contains a specific type of object
            if(obj instanceof String)
            System.out.println(((String)obj).length());

        }

    }
}
