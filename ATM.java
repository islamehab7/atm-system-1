import java.util.Scanner;

public class ATM extends Bank {
    Scanner scanner = new Scanner(System.in);

    public ATM() {
        System.out.println("           Welcome to ATM         ");
        System.out.println("Please Enter your password :");

        String password = scanner.nextLine();

        Account account = AllAccounts.searchForAccount(password);
        if (account == null) {
            System.out.println(" No account found with this number Card ");
        } else {
            if (password.equals(account.password)) {
                System.out.println("Login passed ");
                System.out.println();
                int choice = 0;
                do {
                    System.out.println("Enter the process you want: ");
                    System.out.println("1 - WithDraw");
                    System.out.println("2 - deposit");
                    System.out.println("3 - Display your balance");
                    choice = scanner.nextInt();
                } while (choice != 1 && choice != 2 && choice != 3);
                switch (choice) {
                    case 1 -> account.withdraw();
                    case 2 -> account.deposit();
                    case 3 -> account.displayBalance();
                }
            }
            else {
                System.out.println("Password is not correct, please take your card and try again ");
            }
        }
    }
}
