package com.syntax.class22;

public class Employee {
    String name;
    int baseSalary=30000;
    int baseHolidays=10;

    void calculatePrintSalary(){
        System.out.println(baseSalary);
    }

    void calculatePrintHolidays(){
        System.out.println(baseHolidays);
    }


}

class OfficeBoy extends Employee{

}
class Manager extends Employee{
    @Override
    void calculatePrintSalary() {
        System.out.println((baseSalary*4)+20000);
    }

    void calculatePrintHolidays(){
        System.out.println(baseHolidays*3);
    }
}

class Developer extends Employee{
    void calculatePrintSalary(){
        System.out.println(baseSalary*2+300000);
    }

    void calculatePrintHolidays(){
        System.out.println(baseHolidays*2);
    }
}

class QA extends Employee{
    void calculatePrintSalary(){
        System.out.println(baseSalary*2+200000);
    }

    void calculatePrintHolidays(){
        System.out.println(baseHolidays*3);
    }
}