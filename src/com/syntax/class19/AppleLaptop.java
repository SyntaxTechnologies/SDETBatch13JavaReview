package com.syntax.class19;

import com.syntax.class20.Laptop;

public class AppleLaptop extends Laptop {
    void printMake(){
        // can't access because we are in a different package if its default but can access if its protected
        System.out.println(make);
    }
}
