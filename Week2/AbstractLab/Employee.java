package AbstractLab;

public class Employee extends Person {
    public Employee (String firsName, String lastName){
        this.lastName = lastName;
        this.firstName = firsName;
    }


    @Override
    public double taxes(double amount) {
        return amount * .20;
    }

    @Override
    public double carInsurance(double amount){
        //old people tend to pay less for car insurance
        return amount - 20;
    }
    @Override
    public String toString() {
        return "Employee [last=" + lastName + ", first=" + firstName + "]";
    }
}
