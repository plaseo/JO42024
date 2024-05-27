package Week2.BankingApp;

public class CheckingAccount extends Account {
    private double overDraftLimit;
    public CheckingAccount(String name, double accountBalance, String accountNo, String routingNo, double overDraftLimit){
        super(name, accountBalance, accountNo, routingNo);
        this.overDraftLimit=overDraftLimit;
    }

    //default constructor
    public CheckingAccount(){

    }
    
    public double getOverDraftLimit(){
        return overDraftLimit;
    }
    public void setOverdraftLimit(double overDraftLimit){
        this.overDraftLimit = overDraftLimit;
    }
    //override
    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= getAccountBalance() + overDraftLimit){
            //super keyword is used to refer to the immediate parent class of the current class you're in
            super.withdraw(amount);
        }else{
            System.out.println("Your balance is insufficient or you have surpassed the overdraft limit");
        }
    }

    @Override
    public void transfer(double amount, Account transferAccount){
        //transferring is withdrawing an amount from one account and depositing it in another account
    if(amount > 0 && amount <= getAccountBalance() + overDraftLimit ){
        withdraw(amount);
        transferAccount.deposit(amount);
        System.out.println("You have successfully transferred: $" + amount + "from" + getAccountNo() + "to" + transferAccount.getAccountNo());
        }else{
            System.out.println("Transfer failed. You may have insufficient funds or you're surpassed the overdraft limit");
        }
        
    }

    @Override
    public void monthlyProcessing(){
        //unimplemented method

    }
}

