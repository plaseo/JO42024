package Week2.AbstractLab;

public class Employee extends Person {
    @Override
    public double taxes(double amount) {
        return amount * .20;
    }
}
