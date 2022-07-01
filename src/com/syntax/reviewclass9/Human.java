package com.syntax.reviewclass9;

public class Human {
    String name;
    int age;
    double weight;
    String color;

    public Human(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Human human= new Human("Naveed",22,50,"Super white");
        System.out.println(human);
    }
}

class Employee extends Human{

    String employeeId;
    double salary;
    String title;
    String department;

    public Employee(String name, int age, double weight, String color, String employeeId, double salary, String title, String department) {
        super(name, age, weight, color);
        this.employeeId = employeeId;
        this.salary = salary;
        this.title = title;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

class SDET extends Employee{

    String programmingLanguage;
    String framework;
    boolean knowsSelenium;


    public SDET(String name, int age, double weight, String color, String employeeId, double salary, String title, String department) {
        super(name, age, weight, color, employeeId, salary, title, department);
    }

    public SDET(String name, int age, double weight, String color, String employeeId, double salary, String title, String department, String programmingLanguage, String framework, boolean knowsSelenium) {
        super(name, age, weight, color, employeeId, salary, title, department);
        this.programmingLanguage = programmingLanguage;
        this.framework = framework;
        this.knowsSelenium = knowsSelenium;
    }

    @Override
    public String toString() {
        return "SDET{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", framework='" + framework + '\'' +
                ", knowsSelenium=" + knowsSelenium +
                '}';
    }
}

class Developer extends Employee{

    public Developer(String name, int age, double weight, String color, String employeeId, double salary, String title, String department) {
        super(name, age, weight, color, employeeId, salary, title, department);
    }
}