package Week2.AbstractLab;

public class Student extends Person {
    
    @Override
    public double taxes(double amount) {
        return amount * .02;
    }
}
