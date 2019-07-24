package bankaccauntapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccauntApp {
    public static void main(String[] args) {
        List<Accaunt> accounts = new LinkedList<Accaunt>();

        String file = "C:\\Users\\Админ\\Desktop\\Job\\NewBankAccounts.csv";

        /*Checking checkingacc1 = new Checking("Meirzhan Askerbekov", "950214300536",1500);
        Saving savingacc1 = new Saving("Zangar Akezhanov", "94122310000101",1500);

        checkingacc1.showInfo();
        System.out.println("**************************");
        savingacc1.showInfo();*/

        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")){
                accounts.add(new Saving(name, sSN, initDeposit));
            }
            else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Accaunt acc : accounts){
            System.out.println("********************");
            acc.showInfo();
        }
//        savingacc1.compound();
//
//        savingacc1.deposit(5000);
//        savingacc1.withdraw(2000);
//        savingacc1.transfer(300, "Kaspi Bank");



    }
}
