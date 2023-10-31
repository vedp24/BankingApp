import java.util.Scanner;
public class Bank {

    private double totalBalance, depositAmount, withdrawAmount;
    private double previousTransaction;
    private boolean proceed;
    private Scanner scn;

    public Bank() {
        totalBalance = 0;
        depositAmount = 0;
        withdrawAmount = 0;
        previousTransaction = 0;
        proceed = true;
        scn = new Scanner (System.in);
    }

    public void withdraw(){
        pln("How much money would you like to withdraw");
        withdrawAmount = scn.nextDouble();
        if(withdrawAmount <= 0) {
            pln("Please enter an appropriate amonunt of money you would like to withdraw.");
        } else if (withdrawAmount > totalBalance) {
            pln("You don't have enough money to withdraw $" + withdrawAmount + ".");
        } else {
            totalBalance = totalBalance - withdrawAmount;
            previousTransaction = -withdrawAmount;
            pln("Success! $" + withdrawAmount + " has been withdrawn from your account.");
        }
    }

    public void deposit () {
        pln("How much money would you like to deposit?");
        depositAmount = scn.nextDouble();
        if (depositAmount <= 0) {
            pln("Please enter an appropriate amount of money you would like to deposit.");
        } else {
            totalBalance = totalBalance + depositAmount;
            previousTransaction = depositAmount;
            pln("Success! $" + depositAmount + " has been deposited into your account.");
        }
    }

    public void displayTotal() {
        pln("Account Balance: $" + totalBalance);
    }

    public void displayPreviousTransaction() {
        if(previousTransaction == 0) {
            pln("No previous transaction.");
        } else if (previousTransaction > 0 ) {
            pln("Previous Transaction: Deposited $" + previousTransaction);
        } else {
            pln("Previous Transaction: Withdrew $" + -previousTransaction);
        }
    }

    public void displayOptions() {
        pln("Enter 1 --> Check Balance");
        pln("Enter 2 --> Deposit");
        pln("Enter 3 --> Withdraw");
        pln("Enter 4 --> See Previous Transaction");
        pln("Enter 5 --> Exit");
    }

    public boolean getProceed() {
        return proceed;
    }

    public void changeProceed(boolean s) {
        proceed = s;
    }

    public void pln(String s) {
        System.out.println(s);
    }
}