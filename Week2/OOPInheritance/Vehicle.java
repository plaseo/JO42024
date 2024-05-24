package Week2.OOPInheritance;

public abstract class Vehicle {
    private String engine;
    private int wheels;
    private int seats; 
    private String fuelTank;
    private String lights;
    //abstract method - do not have a body of code
    //an abstract method is like a contract that says every
    ///class that inherits from the abstract class should provide an implementation for said abstract method
    
    public void driving(){
        System.out.println("The vehicle is driving");
    }

    
}
