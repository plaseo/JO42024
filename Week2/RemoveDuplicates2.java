package Week2;
//Write a method to count the number of vowels and consonants in a string. E.g. if the input is Java the result should be 2 vowels and 2 consonants
public class RemoveDuplicates2 {
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
public static void main(String[] args){
    String userWord = "SUPERAWESOME";
    int[] count = countVowels(userWord);
    System.out.println("The number of vowels is " + count[0] + " The number of consonates " + count[1]);

}    
}
