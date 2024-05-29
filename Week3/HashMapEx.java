package Week3;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapEx {
    public static void main(String[] args) {
        //dictionary/hashmap
        HashMap<String, Integer> dictionary = new LinkedHashMap<>();
        //adds a key-value pair to the HashMap
        dictionary.put("John", 1);
        dictionary.put("Michael", 2);
        dictionary.put("Sarah", 3);

        //retrieves the value associatedwith the specified key
        System.out.println(dictionary.get("John"));


    }
    
}
