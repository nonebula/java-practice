package lesson21WhileLoops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //while loop = repeat some code forever
        //              while conditions remain true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        //be wary of infinite loops
        //if you can't change the condition within the while loop, this will result in an infinite loop. DON'T DO THIS!!

        System.out.println("Hello, " + name);

        String response = "";

        //In order to escape this game, must input "Q"
        while(!response.equals("Q")){
            System.out.println("You are playing a game!");
            System.out.println("Press Q to quit");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");

        int age = 0;

        while(age < 0){
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.printf("You are %d years old!\n", age);

        //DO WHILE LOOP - DO WHILE ALWAYS EXECUTES ALL ONCE, WHEREAS WHILE MIGHT NOT
        do {
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.printf("You are %d years old!\n", age);


        int number1 = 0;
        int number2 = 0;

        //WHILE
        while (number1 < 1 || number1 > 10){
            System.out.print("Enter a number between 1 and 10: ");
            number1 = scanner.nextInt();
        }

        System.out.printf("Your number is %d\n", number1);

        //DO WHILE
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number2 = scanner.nextInt();
        } while (number2 < 1 || number2 > 10);

        System.out.printf("Your number is %d\n", number2);

        //close scanner
    }
}
