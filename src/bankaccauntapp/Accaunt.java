package bankaccauntapp;

public abstract class Accaunt implements IBaseRate{
    // LIst common properties for saving and checking accounts
    String name;
    String sSN;
    double balance;

    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize the account

    public Accaunt(String name,String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("NAME: " +name + "sSN: " + sSN + "BALANCE: $" + balance);
    }


    // List common methods

}
