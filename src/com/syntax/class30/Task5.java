package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    /*
        Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who
        gets the highest salary. Output should be in the below format
    John Smith=$100000
         */
    public static void main(String[] args) {

        HashMap<String ,Integer> employeeMap=new HashMap<>();
        employeeMap.put("Abdul",75000);
        employeeMap.put("Tara",76000);
        employeeMap.put("Hamid",85000);
        employeeMap.put("Sameer",65000);
        employeeMap.put("Samad",79000);
        employeeMap.put("Asghar",95000);

        String name="";
        Integer maxSalary=0;
        for (Map.Entry<String,Integer> entry:employeeMap.entrySet()
             ) {
            if(entry.getValue()>maxSalary){
                maxSalary= entry.getValue();
                name= entry.getKey();
            }
        }

        System.out.println(name +" earns the highest salary "+maxSalary);

    }
}
