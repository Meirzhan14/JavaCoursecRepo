package bankaccauntapp;

public abstract class Accaunt implements IBaseRate{
    // LIst common properties for saving and checking accounts
    private String name;
    private String sSN;
    private double balance;
    private static int index = 1000;
    protected String accountNumber;
    protected double rate;

    // Constructor to set base properties and initialize the account

    public Accaunt(String name,String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
        System.out.println(getBaseRate());
        setRate();
    }

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID = index;
        int randNumber = (int) (Math.random()*Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randNumber;
    }
    public abstract void setRate();

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

    // List common methods - transactions
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $"+amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(double amount, String toWhere){
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo(){
        System.out.println("NAME: " + name +
        "\nACCOUNT NUMBER: " + accountNumber +
        "\nBalance: " + balance +
        "\nRATE: " +rate + "%");
    }



}
