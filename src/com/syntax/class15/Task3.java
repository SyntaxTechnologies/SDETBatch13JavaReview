package com.syntax.class15;

public class Task3 {
    // Create a method that will print whether given String is palindrome or not.

    void printIsPalindrome(String str){

        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        String reversedStr=stringBuilder.toString();
        if(str.equals(reversedStr)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is Not palindrome");
        }
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        task3.printIsPalindrome("dad");
        task3.printIsPalindrome("Aladin");

    }
}
