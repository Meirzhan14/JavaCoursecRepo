package bankaccauntapp;

public class Saving extends Accaunt {

    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    public Saving(String name, String sSN, double initdeposit) {
        super(name,sSN,initdeposit);
        accountNumber = "1" + accountNumber;
        setDeposit();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setDeposit(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        getSafetyDepositBoxKey = (int) (Math.random() * Math.pow(10,3));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("YOUR SAVING ACCOUNT FEATURES: " +
                "\n Deposit BOX ID: " + safetyDepositBoxID +
                "\n Deposit Box Key: " + getSafetyDepositBoxKey);
    }
    // List properties specific to saving accounts

    // Constructor to initialize settings for saving account properties

    // List any methods specific to the saving account
}
