package lesson37RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("Welcome to Rock Paper Scissors!");

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) { //.equals not == because it's a reference type variable
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }

            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while(playAgain.equals("yes"));

         System.out.println("Thanks for playing!");

         //scanner.close;
    }
}
