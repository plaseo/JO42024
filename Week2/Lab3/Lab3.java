package Week2.Lab3;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice;
        do{
            System.out.println("1. Method to display first non repeated character of a string then the repeating characters");
            System.out.println("2. Input a string you'd like to have characters removed from");
            System.out.println("3. count the number of vowels and consonants in a word");
            System.out.println("4. remove duplicate characters");
            System.out.println("5. Exit Program :( )");
            userChoice = input.nextInt();
            
        switch(userChoice){
            case 1: 
            System.out.println("please input a string:");
            characterLoops(input.next());
            break;

            case 2:
            System.out.println("Input a string you'd like to have characters removed");
            String originalString = input.next();
            System.out.println("Input the characters you'd like to remove from the string");
            String stringRemove = input.next();
            char charsToRemove[] = stringRemove.toCharArray();
            String resultString = removeChar(originalString, charsToRemove);
            System.out.println("Original : " + originalString);
            System.out.println("Modified : " + resultString);
            break;

            case 3:
            System.out.println("Input word to count the number of vowels and consonants");
            String userWord = input.next();
            int[] count = countVowels(userWord);
            System.out.println("Number of vowels: " + count[0] + " Number of consonants: " + count[1]);
            break;

            case 4:
            System.out.println("Input a string to remove duplicate characters");
            System.out.println(removedup(input.next()));
            
            break;


            default:
            System.out.println("Please enter a valid number. ");

        }
        }while(userChoice != 5);
}

    //method to remove characters from a string
    public static String removeChar(String theString, char[] charactersToRemove){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= theString.length() - 1; i++){
            char currentChar = theString.charAt(i);
            boolean isRemovable = false;
            for(char moveIt: charactersToRemove){
                if(currentChar == moveIt){
                    isRemovable = true;
                    break;
                }
            }
            if(!isRemovable){
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    //method to display first non-repeated character of string then the repeating characters
    public static String characterLoops (String userString) {
        String someLetters = "";
        String repeatingLetters = "";
        for (char i : userString.toCharArray()) {
            if (userString.indexOf(i) == userString.lastIndexOf(i)) {
                someLetters += i;
                continue;
            }else{
                repeatingLetters += i;
            }
            }
        System.out.println("Result: " + someLetters + repeatingLetters);
        return someLetters + repeatingLetters;
    }

    //method to count the number of vowels and consonants
    public static int[] countVowels(String vowAndCons){
        int numberOfVowels = 0;
        int numberofCons = 0;
        vowAndCons = vowAndCons.toLowerCase();
        for(char ch: vowAndCons.toCharArray()){
            if(ch >= 'a' && ch <= 'z' ){
                if(isVowel(ch)){
                    numberOfVowels ++;
                }else{
                    numberofCons ++;
                }
            }
        }return new int[] {numberOfVowels, numberofCons};
    }
        public static boolean isVowel(char ch){
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    //method to remove duplicate characters from a string
    public static String removedup (String userString){
        String result = "";
        for(int i = 0; i < userString.length(); i++){
           String superDuper = ""+userString.charAt(i);
           if(result.contains(superDuper)){
            continue;
           }
           result += superDuper;
        }
        return result;
    }

}

