package Week2.OOPEncapsulation;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        //we use our objects to invoke/call methods in a class
        d1.setName("Doug");
        d1.setBreed("Golden Retriever");
        d1.setGender("Male");
        d1.setAge(6);
        d1.setColor("Brown");

        System.out.println("Your dogs name is: "  + d1.getName());
        d1.sleep();

        Dog d2 = new Dog("Buddy", "Jack Russel", 4, "male");
            d2.bark();
        }

        
    }
