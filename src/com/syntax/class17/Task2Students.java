package com.syntax.class17;

public class Task2Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Task2Students task2Students=new Task2Students();
        task2Students.name="Arif007";
        task2Students.id="JB123";
        numberOfStudents=1;// if we are inside the same class we can access static variables inside static
        //methods by just writing the name of that variable we don't need to create an object
        System.out.println(task2Students.name);
        System.out.println(task2Students.id);
        System.out.println(numberOfStudents);

        Task2Students task2Students2=new Task2Students();
        task2Students2.name="Arif008";
        task2Students2.id="JB1234";
        numberOfStudents=2;
        System.out.println(task2Students2.name);
        System.out.println(task2Students2.id);
        System.out.println(numberOfStudents);


    }

}
