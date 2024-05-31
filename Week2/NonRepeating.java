package Week2;

import java.util.*;

public class NonRepeating {
    public static void main(String[] args){
        String userString = "mmorning";
        //int index = 0;
        char someLetters = ' ';
       
            for (char i : userString.toCharArray()) {
                if (userString.indexOf(i) == userString.lastIndexOf(i)) {
                    someLetters = i;
                    break;
                }
                else {
                    i += 1;
                }
            }
        System.out.println("NonRepeatingCharacter " + someLetters);
        System.out.println(someLetters);
        }

    }
  