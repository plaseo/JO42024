package Lab3;


import java.util.*;
//
//Write a method to display first non repeated character of a string then the repeating characters. E.g. input morning should display morignn
public class NonRepeating {
    public static void main(String[] args){
        String userString = "whoopies";
        //int index = 0;
        String someLetters = "";
        String repeatingLetters = "";
       
            for (char i : userString.toCharArray()) {
                System.out.println(userString.indexOf(i) + " " + userString.lastIndexOf(i));
                if (userString.indexOf(i) == userString.lastIndexOf(i)) {
                    // System.out.println(userString.indexOf(i) + " " + userString.lastIndexOf(i));

                    someLetters += i;
                    continue;
                }
                else {
                    repeatingLetters += i;
                }
            }
        System.out.println("NonRepeatingCharacter " + someLetters + repeatingLetters);
        // System.out.println(someLetters);
        }

    }
  