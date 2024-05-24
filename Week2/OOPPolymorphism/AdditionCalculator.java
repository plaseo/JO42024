package Week2.OOPPolymorphism;

public class AdditionCalculator extends Calculator {
    //overloading: allows a class to have multiple methods with the same name but different parameters
    //the compilter determines which method to call at the compile time based on the number and types of arguments passed to the method
    public double calculate(double a, double b){
        return a * b;
    }
    
}
