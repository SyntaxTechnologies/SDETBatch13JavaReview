package com.syntax.class30;

import java.util.TreeMap;

public class Task4 {
    /*
   Create a Person class with following private fields: firstName, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print Person details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
    */
    public static void main(String[] args) {

        TreeMap<Integer,Person> personTreeMap=new TreeMap<>();
        personTreeMap.put(1,new Person("Zameer patti chai","Zombi",300,100000));
        personTreeMap.put(2,new Person("Arif","022",25,200000));
        personTreeMap.put(3,new Person("Ozkan","Kara",22,300000));
        personTreeMap.put(4,new Person("Asghar","Nazir",27,10));

        for (Person p: personTreeMap.values()
             ) {
            System.out.println(p);
        }
    }
}

class Person{
    private String firstName;
    String lastname;
    int age;
    double salary;

    public Person(String firstName, String lastname, int age, double salary) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
