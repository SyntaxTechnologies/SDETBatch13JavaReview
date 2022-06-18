package com.syntax.class19;

public class Task2 {
/*Create a method that will take a String
as a parameter and returns reversed String.
Method should be available to all classes within
your project and accessible by class name.
 */

     public static String reverseString(String str){
      return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Task2.reverseString("Monday"));
    }
}
