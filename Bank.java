import java.util.Random;
import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);
    public Bank() {}

    public void openNewAccount(){
        Account account = new Account();

        System.out.println();
        System.out.println("                       Welcome to The bank, please fill out this form to open new account for you ");
        System.out.println();

        System.out.println("Enter your name: ");
        account.name = scanner.nextLine();

        System.out.println();
        do{
            System.out.println("Enter your National ID (your national ID must be 14 number): ");
            account.nationalID = scanner.nextLine();
        } while (account.nationalID.length() != 14);


        do{
            System.out.println("Enter your address: ");
            account.address = scanner.nextLine();
        } while (account.address.isEmpty());

        System.out.println("Enter your dateOfBirth: ");
        account.dateOfBirth = scanner.nextLine();

        account.accountNumber = String.valueOf(new Random().nextLong(100000456, 658794498));

        do{
            System.out.println("please, Enter your password: ");
            account.password = scanner.nextLine();
        } while (account.password.isEmpty());


        System.out.println("Enter your initial balance: ");
        account.balance = scanner.nextDouble();

        AllAccounts.addAccount(account);

        System.out.println("Congratulations !! you opened a new account with the card number: " + account.accountNumber);

        account.displayDataOfAccount(account);

        // 12 % benefits every year
        System.out.println("Your balance after one year: " + account.addBenefits());

    }
}
