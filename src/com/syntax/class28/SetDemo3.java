package com.syntax.class28;

import java.util.TreeSet;

public class SetDemo3 {


    public static void main(String[] args) {
        TreeSet<Integer> sortedNumbers=new TreeSet<>();
        sortedNumbers.add(1);
        sortedNumbers.add(10);
        sortedNumbers.add(12);
        sortedNumbers.add(2);
        sortedNumbers.add(3);
        sortedNumbers.add(3);
        System.out.println(sortedNumbers);
    }
}