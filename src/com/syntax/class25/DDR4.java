package com.syntax.class25;

interface DDR3{
    void read();
    void write();
}

public interface DDR4 extends DDR3{

    void speed();
}

class SamsungRam implements DDR4{

    @Override
    public void read() {
        System.out.println("Reading speed is now 3GBp/s");
    }

    @Override
    public void write() {
        System.out.println("Writing speed is now 3GBp/s");
    }

    @Override
    public void speed() {
        System.out.println("Extra speed of 1GBPs");
    }
}
