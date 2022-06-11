package com.syntax.class15;

public class Task6 {
    /*Write a method to return whether given number is prime or not?*/

    boolean isPrime(int x){
        boolean isPrime=true;
        if(x>1) {

            for(int i=2;i<x;i++) {
                if(x%i==0) {  // if the number that user has provided if that number is completely divisable by any other number
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Task6 task=new Task6();
        System.out.println(task.isPrime(5));
    }
}
