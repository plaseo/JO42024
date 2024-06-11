package Week2.AbstractLab;

public abstract class Person {
    protected String lastName;
    protected String firstName;
    
    public abstract double taxes(double amount);

    public double calculateTelePhoneBill(double amount){
        return this.taxes(amount) + amount;
    }
}

