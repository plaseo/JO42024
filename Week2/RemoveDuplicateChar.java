package Week2;

// Write a method to remove duplicate characters from a string.
public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "abcabcabcabcabc";
        
        String result = "";

        for(int i = 0; i < str.length(); i++){
           String superDuper = ""+str.charAt(i);
           //System.out.println(ch);
           if(result.contains(superDuper)){
            continue;
           }
           result += superDuper;
           
        }
        System.out.println(result);

}


}

