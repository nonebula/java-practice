
import lesson1BasicOutput.BasicOutput;
import lesson2Variables.Variables;
import lesson3UserInput.UserInput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
        System.out.println("Select a lesson to run:");
        System.out.println("1. BasicOutput");
        System.out.println("2. Variables");
        System.out.println("3. UserInput");
        System.out.println("0. Exit");

        System.out.println("Enter your choice:");

        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    BasicOutput.main(args);
                    break;
                case 2:
                    Variables.main(args);
                    break;
                case 3:
                    UserInput.main(args);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 4.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
        }
        }

        scanner.close();
    }
}