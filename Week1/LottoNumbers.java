
import java.util.random.RandomGenerator;

public class LottoNumbers {
    public static void main (String[] args){
        // program to generate lotto numbers
        // 5 numbers are picked from a set of 69
        // 1 number is drawn from a set of 26 (powerball)
        
        int randomNum = RandomGenerator.getDefault().nextInt(1, 70);
        System.out.println(randomNum);

    
    }
}
