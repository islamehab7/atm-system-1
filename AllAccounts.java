import java.util.ArrayList;
import java.util.List;

public class AllAccounts {
    public static List<Account> accounts = new ArrayList<>();

    public static void addAccount(Account account){
        accounts.add(account);
    }

    public static void removeAccount(Account account){
        accounts.remove(account);
    }

    public static Account searchForAccount(String password){
        for (Account account: accounts){
            if (account.password.equals(password)) return account;
        }

        return null;
    }


}
