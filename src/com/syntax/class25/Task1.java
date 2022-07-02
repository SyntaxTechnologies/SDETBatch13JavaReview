package com.syntax.class25;

import com.sun.media.sound.SoftTuning;

import javax.tools.JavaFileObject;
import java.util.Scanner;

public class Task1 {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open is an
    abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
     implementation of open behaviour: Example: to open .java file we need notepad++ or
     sublime text, to open .doc file we need Microsoft word to be installed etc
     */


    public static void main(String[] args) {
        File[] files={new JavaFile(),new PdfFile(),new WordFile()};
       // Scanner[] scanners={new Scanner(System.in),new String()}; not possible to store the objects of a class if they don't have parent child relationship
        int[] numbers={10,20,30};
        for(File file:files){
            file.open();
            file.edit();
            file.close();

        }

        //new JavaFile().open();
        /*JavaFile arslan=new JavaFile();
        javaFile.open();*/
    }
}
abstract class File{
/*   private String name;
   File(String name){
       this.name=name;
   }*/
   abstract void open();
   void edit(){
     //  System.out.println(name);
       System.out.println("Editing the file");
   }
   void close(){
       System.out.println("Closing the file");
   }
}

class JavaFile extends File{


    void open(){
        System.out.println("Use Intellij to open Java files");
    }


    void edit() {
        System.out.println("Editing the file with intellij");
    }
}

class WordFile extends File{

    void open() {
        System.out.println("Use Microsoft word to open the word file");
    }
}

class PdfFile extends File{


    void open() {
        System.out.println("Use Adobe reader to open the pdf fie");
    }
}