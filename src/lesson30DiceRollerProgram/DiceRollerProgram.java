package lesson30DiceRollerProgram;

import java.util.Random;
import java.util.Scanner;

public class DiceRollerProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //variables
        int numOfDice;
        int total = 0;

        //user input
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        //catch bad input
        if(numOfDice > 0){

            //handle good input
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(6) + 1;
                printDie(roll);
                total += roll; //augmented assignment operator
            }
            System.out.println("You rolled " + numOfDice + " dice with a total of " + total);

        } else if (numOfDice > 12) {
            System.out.println("Too many dice roll to roll, please enter a number between 1 and 12");
        } else {
            System.out.println("# of dice must be greater than 0");
        }

        //close scanner
    }

    //create ASCII art
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   .   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                |     . |
                |       |
                | .     |
                 -------
                """;
        String dice3 = """
                 -------
                |     . |
                |   .   |
                | .     |
                 -------
                """;
        String dice4 = """
                 -------
                | .   . |
                |       |
                | .   . |
                 -------
                """;
        String dice5 = """
                 -------
                | .   . |
                |   .   |
                | .   . |
                 -------
                """;
        String dice6 = """
                 -------
                | .   . |
                | .   . |
                | .   . |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll!");
        }
    }
}
