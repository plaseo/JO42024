package Week3;
import java.util.*;

public class StackEX {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Burger");
        stack.push("Pizza");
        stack.push("Fries");


        //remove element - last in first out, popping
        System.out.println(stack.pop());

        //show the element at the top
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
        






        




    }
    
}
