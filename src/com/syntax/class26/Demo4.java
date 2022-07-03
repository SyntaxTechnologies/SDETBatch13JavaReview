package com.syntax.class26;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Zameer");
        names.add("Kelvin");
        names.add("Degrees");
        names.add("AbdulSamadBond");
        System.out.println(names);
        names.remove("Kelvin");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
    }
}
