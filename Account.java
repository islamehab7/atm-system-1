import java.util.Scanner;

public class Account extends Client {
    String accountNumber, password;
    Double balance;

    Scanner scanner = new Scanner(System.in);

    public Account(String name, String address, String nationalID, String dateOfBirth, String accountNumber, String password, Double balance) {
        super(name, address, nationalID, dateOfBirth);
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    //    public Account(String accountNumber, Double balance) {
//        super();
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }

    public Account() {}

    public void deposit(){
        System.out.println("Enter your amount of money which you want to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        displayBalance();
    }

    public void withdraw(){
        System.out.println("Enter your amount of money which you want to withdraw: ");
        System.out.println("Between 0 and 4000$ ");

        double amount = scanner.nextDouble();
        if (balance >= amount && amount <= 4000 && amount > 0) {
            balance = balance - amount;
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );
        }
        displayBalance();
    }

    public double addBenefits() {
        return balance + (balance * 0.12);
    }

    public void displayBalance(){
        if (balance == null) balance = 0.0;
        System.out.println("Your balance now is " + balance +" $");

        displayThanks();
    }

    public void displayThanks(){
        System.out.println();
        System.out.println("          Thank you for banking with us !");
    }

    public void displayDataOfAccount(Account account){
        System.out.println();
        System.out.println("                        Your Account             ");

        System.out.println("Name: " + account.name);
        System.out.println("National ID: " + account.nationalID);
        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Balance: " + account.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
