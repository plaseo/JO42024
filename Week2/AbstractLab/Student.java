package AbstractLab;

public class Student extends Person implements Bills{
    
    public Student (String firsName, String lastName){
        this.lastName = lastName;
        this.firstName = firsName;
    }
    
    @Override
    public double taxes(double amount) {
        return amount * .02;
    }

    @Override
    public double gasBill(double amount){
        return amount;
    }

    @Override
    public double carInsurance(double amount){
        //young person pays more for car insurance
        return amount + 20;
    }

    @Override
    public String toString() {
        return "Student [last=" + lastName + ", first=" + firstName + "]";
    }
    
}
