package com.syntax.class26;

import com.sun.org.apache.bcel.internal.generic.LSTORE;
import com.syntax.reviewclass3.IFElse;
import kotlin.collections.builders.MapBuilder;

import java.util.Arrays;

public interface MoveAble {
     void move();
}


class Car implements MoveAble{


    public void move() {
        System.out.println("A car can move");
    }

    public void park(){
        System.out.println("you can park me");
    }
}

class Person implements MoveAble{

    @Override
    public void move() {
        System.out.println("Humans can also move");
    }
}
class Test{


    public static void main(String[] args) {
        MoveAble moveAble=new Car(); // widening
        moveAble.move();
        ((Car)(moveAble)).park(); // narrowing


        // with interfaces, we can also use polymorphism
        MoveAble [] moveAbles={new Car(),new Person()};




    }
}