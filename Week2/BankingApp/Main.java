package Week2.BankingApp;

public class Main {
    public static void main(String[] args) {
        //create a checking account
        Account checkAcct = new CheckingAccount("Cameron", 37.55, "008", "901020202", 250.00);
        System.out.println("Current account balance: " + checkAcct.getAccountBalance());
        checkAcct.withdraw(5.50);
        System.out.println("Your new account balance is: " + checkAcct.getAccountBalance());




    }
    
}
