package Week2;

public class RemoveLettersFromStr {
    public static void main(String[] args){
        String originalString = "Averange";
        char[] charsToRemove = {'A', 'a'};
        String resultString = removeChar(originalString, charsToRemove);
        System.out.println("Original : " + originalString);
        System.out.println("Modified : " + resultString);
    }
    //create a method that removes an array of characters from a given string
    //string
    //the first parameter is the given string that we need to remove the characters from
    //characters
    //
    //The second parameter is an array of characters to be removed from the string
    public static String removeChar(String starlet, char[] charactersToRemove){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= starlet.length() - 1; i++){
            char currentChar = starlet.charAt(i);
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
}