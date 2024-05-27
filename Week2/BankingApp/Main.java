package Week2.BankingApp;

public class Main {
    public static void main(String[] args) {
        //create a checking account
        Account checkAcct = new CheckingAccount("Cameron", 37.55, "008", "901020202", 250.00);
        Account saviAccount = new SavingsAccount("Cameron", 37.55, "008", "901020202", 6.7, 5, 5);
        System.out.println("Current account balance: " + checkAcct.getAccountBalance());
        checkAcct.withdraw(5.50);
        System.out.println("Your new account balance is: " + checkAcct.getAccountBalance());

        checkAcct.transfer(15.01, saviAccount);
        System.out.println(checkAcct.getName() + " your new balance after your transfer is " + checkAcct.getAccountBalance());
        System.out.println(saviAccount.getName() + " your new balance after receiving a transfer is " + saviAccount.getAccountBalance());
        

    }
    
}
