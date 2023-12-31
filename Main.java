import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // fake data as Database of bank 's accounts
        AccountsDataSet.addFakeData();
        Bank bank = null;
        Scanner scanner = new Scanner(System.in);

        // opening a new account in the Bank
        System.out.println();
        System.out.println("                        Welcome to the Banking System           ");
        int choice = 0;
        do {
            System.out.println("Choose :");
            System.out.println("1- Using ATM");
            System.out.println("2- Open a new account");
            choice = scanner.nextInt();
        } while (choice != 1 && choice != 2);
        if (choice == 1){
            // References conversion (Polymorphism)
             bank = new ATM();
        } else {
            bank = new Bank();
            bank.openNewAccount();
        }
    }
}