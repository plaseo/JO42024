package Week3;
import java.util.;
import java.util.Linked;

public class Ex {
    public static void main(String[] args) {
        //dictionary/
        <String, Integer> dictionary = new Linked<>();
        //adds a key-value pair to the 
        dictionary.put("John", 1);
        dictionary.put("Michael", 2);
        dictionary.put("Sarah", 3);

        //retrieves the value associatedwith the specified key
        System.out.println(dictionary.get("John"));


    }
    
}
