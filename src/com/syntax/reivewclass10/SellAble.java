package com.syntax.reivewclass10;

public interface SellAble {
    void sell();


}

interface ChargeAble {
    void charge();
}

class Laptop implements SellAble,ChargeAble{

    @Override
    public void sell() {
        System.out.println(" you can sell me");
    }

    @Override
    public void charge() {
        System.out.println("Charging............");
    }
}
