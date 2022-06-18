package com.syntax.class19;

public class Task5 {

    /* Write a java Class Students that have a constructor
which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables. */

    // Break till 11:46
    public static void main(String[] args) {
        Student student=new Student("Best Student Ozkhan ",99.9,98.8,99.5);
        student.calculateAvgGrade();

        Student student2=new Student("Bad sameer ",60.5,52.2,99.5);
        student2.calculateAvgGrade();
    }
}
