package playground;

public class fook {
    public static void main(String[] args) {
        removeChar(null, null);
    }
    //The second parameter is an array of characters to be removed from the string
    public static String removeChar(String starlet, char[] charactersToRemove){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= starlet.length(); i++)
            char currentChar = starlet.charAt(i);
            boolean isRemovable = false;
            for(char moveIt: charactersToRemove)
                if(currentChar == moveIt)
                    isRemovable = true;
                    break;
        
            if(!isRemovable)
                result.append(currentChar);
            
            return result.toString();
    }
}
