package Week2;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Cameron";
        String sentence = "Hello, This is Cameron";
        System.out.println(sentence);
        //a string is similar to an array, each character is a letter
        char[] name1 = {'C','a','m','e','r','o','n'};
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
        //returns the size of a string
        System.out.println(name.length());
        //return a new string within the range of the beginning index and ending index
        System.out.println("Your nickname is: " + name.substring(0, 3));
        //return the index of the beginning of a string
        //if you get -1 if it doesn't find an index
        System.out.println(sentence.indexOf("This"));

        //allows you to change the case of a string
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String userInput = "potato, tomato, spinach, celery";
        //The split method separates values in a string based on the delimiter
        //String[] veggies = userInput.split(", ");
        //allows you to have multiple delimiters
        String[] veggies = userInput.split("[,://s]+");
        for(String veg: veggies){
            System.out.println(veg);
        }





    }
    
}
