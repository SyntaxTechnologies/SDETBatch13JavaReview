package com.syntax.class17;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Zombie";
        teacher.schoolName="Marvard";

        /*
        Becuase printInfo is public we can call
        it in other classes and because its the
        part of Teacher class it can access the
        private fields which in turn let us access
        those fields
         */
        teacher.printInfo();
    }
}
