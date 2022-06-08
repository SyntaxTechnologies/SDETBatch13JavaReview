OOP(Object oriented programming):
    Object oriented programming is just a way of writing code and classes and objects are
    the basic parts of this method.

Why we should learn the OOP?
    1) Because OOP simplifies the development of programs
    2) it makes it easy to manage and maintain large programs.
    3) OOP is built around objects classes and many other things which can help us
    translate real life objects into computers.
How to write programs using OOP.
    1)Create classes inside the classes define properties/fields/attributes to translate how an object
    from real life looks like
    2)Create methods/behaviours/functions to define how that thing works in real life.
Note:
OOP is also supported in many other programming languages like C#, PHP, Python, Javascript etc.
other than OOP we also have different paradigm or ways of writing code functional programming
is one of it we also have procedural programming.

How do we create a class and its object:
    class Human{
    String name;  // attributes/properties/fields
    int age;
    char gender;
    double weight;

    //methods/ functions/behaviours
    void walk(){

System.out.println("I can walk");
    }

public static void main(String [] agrs){

Human sameer= new Human();
sameer.name="Naughty Sameer";
sameer.age=20;
sameer.weight=90;
sameer.gender='M';
sameer.walk();

}
    }
in java its convention to call the attributes as fields and call the behaviours as methods
Rules:
1) we can define the fields and methods anywhere in the class.
2) The sequence of execution only matters when we are inside a method.
String is most widely used class in java

