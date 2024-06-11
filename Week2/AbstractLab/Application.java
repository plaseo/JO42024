package Week2.AbstractLab;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        Employee e1 = new Employee();
        System.out.println("s1 Phone Bill: " + s1.calculateTelePhoneBill(120.5));
        System.out.println("e1 Phone Bill: " + e1.calculateTelePhoneBill(120.5));
        
        Person p1 = new Student();
        Person p2 = new Employee();
        System.out.println("p1 Phone Bill: " + p1.calculateTelePhoneBill(120.5));
        System.out.println("p2 Phone Bill: " + p2.calculateTelePhoneBill(120.5));



    }
    
}
