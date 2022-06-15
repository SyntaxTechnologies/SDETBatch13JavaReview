package com.syntax.class17;

public class Employee {

    public String name;
    public static String manager="Cindy";

    private int salary;
    String department;
    private void printSalary(){
        System.out.println("Salary "+salary);
    }
    public  static void printManager(){
        System.out.println(manager);
    }
    void printDepartment(){
        System.out.println("Department "+department);
    }
    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Jason";
        emp.department="IT Destroyer";
        emp.salary=150000;
        emp.printName();
        emp.printDepartment();
        emp.printSalary();

    }
}
