import java.util.Scanner;
public class BankingApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Bank bankAccount = new Bank();
        pln("Welcome to the Banking Application!");
        int option = 0;
        while (bankAccount.getProceed()) {
            bankAccount.displayOptions();
            pln("-------------------------------------");
            option = scn.nextInt();
            switch (option) {
            case 1:
                bankAccount.displayTotal();
                break;
            case 2:
                bankAccount.deposit();
                break;
            case 3:
                bankAccount.withdraw();
                break;
            case 4:
                bankAccount.displayPreviousTransaction();
                break;
            case 5:
                pln("Thank you for banking with us! Have a good day :)");
                bankAccount.changeProceed(false);
                break;
            default:
                pln("Try Again!");
            }
        }
}

public static void pln(String s) {
        System.out.println(s);
    }

}

