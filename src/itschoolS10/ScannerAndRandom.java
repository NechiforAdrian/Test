package itschoolS10;

import java.util.Random;
import java.util.Scanner;

public class ScannerAndRandom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in is just in case scanner use our number
        System.out.println("Please provide a number: ");
        int userInput = scanner.nextInt();
        System.out.println("User input: " + userInput);

        Random random = new Random();
        int randomNumber = random.nextInt(userInput);
        System.out.println("Random number is: " + randomNumber);

        scanner.close();
    }
}
