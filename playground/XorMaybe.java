package playground;

import java.util.Scanner;

public class XorMaybe {
    public static void main(String[] args) {
        xor();
    }
    //xor function

    //System.out.println("Please input ")
    public static void xor(){//(boolean boolOne, boolean boolTwo){
        boolean boolOne = false;
        boolean boolTwo = false;
        System.out.println("Please input two booleans");
        Scanner input = new Scanner(System.in);
        boolOne = input.nextBoolean();
        boolTwo = input.nextBoolean();
        //return ((boolOne && !boolTwo) || (!boolOne && boolTwo));
        if ((boolOne && !boolTwo) || (!boolOne && boolTwo)){
            System.out.println("True!");
        }else{
            System.out.println("Drink some water!");
        }
        //I tried to do a return statement here but it then doesn't let me print the output! Maybe teacher can help me ;)
        //return (boolOne && !boolTwo) || (!boolOne && boolTwo);
        
        

    
    }

}
