package bankaccauntapp;

public class Checking extends Accaunt{

    // List properties specific to checking accounts
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize settings checking account properties

    public Checking(String name, String sSN, double initDeposit) {
        super(name,sSN,initDeposit);
        System.out.println("New checking account");

    }




    // List any methods specific to the checking account
}
