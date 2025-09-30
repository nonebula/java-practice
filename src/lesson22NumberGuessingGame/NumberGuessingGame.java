package lesson22NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if(guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.printf("Correct! The number was %d\n" , randomNumber);
                System.out.printf("You guessed the number between %d and %d in %d attempts.\n", min, max, attempts);
            }

        } while (guess != randomNumber);
    }
}
