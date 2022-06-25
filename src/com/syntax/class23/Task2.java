package com.syntax.class23;

public class Task2 {
    /*
    Create a class CreditCard and define variable balance and interest.
     Create an instance method that will calculate interest
 based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    // break till 11:45


    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,15);
        creditCard.calculateInterest();
        Visa visa=new Visa(200,20);
        visa.calculateInterest();
        AX ax=new AX(100,15);
        ax.calculateInterest();

    }
}
class CreditCard{
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public  void calculateInterest(){
        System.out.println("Interest "+(balance*interest/100));
    }
}
class Visa extends CreditCard{
    Visa(double balance, double interest){
        super(balance,interest);
    }
}
class AX extends CreditCard{

    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest "+((balance*interest/100)+5));
    }
}