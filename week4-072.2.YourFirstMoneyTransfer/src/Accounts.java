
public class Accounts {

    public static void main(String[] args) {
        
        
        Account dennisAccount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0);
        dennisAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(dennisAccount);
        System.out.println(myAccount);
    }

}
