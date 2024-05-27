package playground;

import java.util.ArrayList;
import java.util.Scanner;

public class doubleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter line: ");
        ArrayList<Double> nums = new ArrayList<Double>();
        //double doubles = input.nextDouble();
          
          while (input.hasNextDouble()) {
            nums.add(input.nextDouble());
            }
            double sum = 0;
            for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            }
            System.out.println(sum);
            if(input.hasNext("s")){
                System.out.println("poop");
            }
            if(input.hasNext("d")){
                System.out.println("lol");
            }if(input.hasNext("z")){
                System.out.println("lolz");
            }










    }
}


