package lesson20LogicalOperators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);

        double temp = 20;
        boolean isSunny = true;

        if(temp <= 30 && isSunny){
            System.out.println("The weather is good!");
            System.out.println("It is sunny outside, too.");
        } else if(temp <= 15 && !isSunny){
            System.out.println("The weather isn't good!");
            System.out.println("It is cloudy outside, too.");
        } else if(temp >= 15 || isSunny){
            System.out.println("At least it isn't miserable outside.");
        } else {
            System.out.println("Typical English weather!");
        }

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4 and 12 characters.");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain whitespace or underscore characters.");
        } else {
            System.out.printf("Welcome, %s!\n", username);
        }

    }
}
