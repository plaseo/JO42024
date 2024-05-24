package Week2.BankingApp;

public abstract class Account {
    private String name;
    private double accountBalance;
    private String accountNo;
    private String routingNo;

    //default constructor
    public Account(){
    
    }
    
    //parameterized constructor
    public Account(String name, double accountBalance, String accountNo, String routingNo){
        this.name = name;
        this.accountBalance = accountBalance;
        this.accountNo = accountNo;
        this.routingNo = routingNo;


    }
    

    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getRoutingNo() {
        return routingNo;
    }
    public void setRoutingNo(String routingNo) {
        this.routingNo = routingNo;
    }

    public void withdraw(double amount){
        //do we need any checks on the amount before using it 
        //what should I do with the amount with respect to the accountBalance
        //we need to check whether we have enough
        if(amount > 0 && amount <= accountBalance){
            //account balance = account balance - amount;
            accountBalance -= amount;

        }
    }

    public void deposit(double amount){
        if (amount > 0){
            //add the amount to the account balance
            accountBalance += amount;

        } 

    }

    public abstract void transfer(double amount, Account transAccount);
    public abstract void monthlyProcessing();

    






}
