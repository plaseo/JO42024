package playground;

import java.util.Random;

public class PowerballNumberGenerator {
    public static void main(String[] args) {
        int[] powerballNumbers = generatePowerballNumbers();
        System.out.println("Generated Powerball numbers:");
        for (int number : powerballNumbers) {
            System.out.print(number + " ");
        }
    }

    public static int[] generatePowerballNumbers() {
        int[] powerballNumbers = new int[5];
        Random random = new Random();

        // Generate five unique Powerball numbers
        for (int i = 0; i < 5; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(69) + 1;
            } while (containsNumber(powerballNumbers, randomNumber));

            powerballNumbers[i] = randomNumber;
        }

        return powerballNumbers;
    }

    private static boolean containsNumber(int[] array, int number) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }
}
