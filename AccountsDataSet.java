import java.util.Random;

public class AccountsDataSet {
    public static void addFakeData(){
        Account account1 = new Account("Ahmed", "Menof", "30011198800615", "2000/11/19", String.valueOf(new Random().nextLong(100000456, 658794498)), "12345", 1000.0);
        Account account2 = new Account("Eslam", "Cairo", "30046842800615", "2000/11/19", String.valueOf(new Random().nextLong(100000456, 658794498)), "12345", 200.0);
        Account account3 = new Account("Mohsen", "Alex", "30011198800615", "2000/11/19", String.valueOf(new Random().nextLong(100000456, 658794498)), "12345", 1000.0);

        AllAccounts.addAccount(account1);
        AllAccounts.addAccount(account2);
        AllAccounts.addAccount(account3);
    }
}
