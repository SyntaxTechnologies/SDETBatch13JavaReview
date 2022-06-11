package com.syntax.class15;

public class MD2 {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        ArrayUtils arrayUtils=new ArrayUtils();
        arrayUtils.printArray(arr);
        int sum=arrayUtils.sumArray(arr);
        System.out.println(sum);

    }
}
