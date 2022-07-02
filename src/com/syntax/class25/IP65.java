package com.syntax.class25;

public  interface IP65 {
    ///private String make="LG"; interface can only have public fields
    ///protected String make="LG"; interface can only have public fields

   // public static final String make="LG";
   // no need to write public static final why because all the fields by default are public static final
   // String make="Samsung";
    void wash();

}
interface FiveG{
    void speed();
}
interface FastChargeAble{
    void charging();
}

class S21Ultra implements IP65,FastChargeAble,FiveG{

    @Override
    public void wash() {
        System.out.println("You guys can wash me easily ezi pizi no issue");
    }

    @Override
    public void charging() {
        System.out.println("i support Fast charging now because i have implemented this requirement as well");
    }

    @Override
    public void speed() {
        System.out.println(" you can download things super fast because now i also support 5G");
    }

    public static void main(String[] args) {
        IP65 ip65=new S21Ultra();
        ip65.wash();
    }
}