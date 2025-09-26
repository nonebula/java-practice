package lesson3UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        //3. User input & scanners

        //setup for a scanner. Scanner object can read user input
        Scanner scanner = new Scanner(System.in);

        //for separate line (with string)
        System.out.println("What is your name?");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName);

        //for same line (with int)
        System.out.print("What is your age?");
        int userAge = scanner.nextInt();

        System.out.println("You are " + userAge + " years old");

        scanner.nextLine();

        //with double
        System.out.println("What is your weight?");
        double userWeight = scanner.nextDouble();

        System.out.println("You are " + userWeight + "kg");

        scanner.nextLine();

        //with boolean
        System.out.println("Are you happy? (true/false)");
        boolean userHappy = scanner.nextBoolean();

        if (userHappy) {
            System.out.println("You are happy");
        } else {
            System.out.println("You are not happy");
        }

        //good practice to close at the end, if not, unexpected behaviour


        //calculate area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner1.nextDouble();

        System.out.println("Enter the height: ");
        height = scanner1.nextDouble();

        area = width * height;
        System.out.println("The area is " + area + "cm^2");

    }
}
