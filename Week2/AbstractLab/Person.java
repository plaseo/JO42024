package AbstractLab;

public abstract class Person {
    protected String lastName;
    protected String firstName;
    
    public abstract double taxes(double amount);

    public double calculateTelePhoneBill(double amount){
        return this.taxes(amount) + amount;
    }

    public abstract double carInsurance(double amount);

    public double calculateGasBill(double amount){
        //always random fees on my gas bill
        return amount + 5.00;
    }

    @Override
    public String toString() {
        return "Person [last=" + lastName + ", first=" + firstName + "]";
    }
    

}


