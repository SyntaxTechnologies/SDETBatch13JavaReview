package com.syntax.class27;

import sun.security.util.AuthResources_it;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // we can store the object of a class inside a variable of type parent class
        // interface if that class implements that interface
        List<String> legends= new ArrayList<>();
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Bahram"));
        System.out.println(legends.contains("Hamid")); // will return true
        System.out.println(legends);
        legends.remove("Hamid");
        System.out.println(legends);

        List<String> someStudents=new ArrayList<>();
        someStudents.add("Naveed");
        someStudents.add("Yusuf");
        System.out.println(legends.containsAll(someStudents));


    }
}
