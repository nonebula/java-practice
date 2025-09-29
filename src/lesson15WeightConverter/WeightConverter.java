package lesson15WeightConverter;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        //Declare variables
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        //Create welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("Welcome to the conversion program!");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        //Prompt for user input
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        //Option 1 - convert lbs to kgs
        if(choice == 1) {
            System.out.print("Please enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.3f" , newWeight);
        //Option 2 - convert kgs to lbs
        } else if(choice == 2) {
            System.out.println("Please enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.3f" , newWeight);
        //Else print 'not a valid choice'
        } else {
            System.out.println("Invalid choice");
        }

        //close scanner
    }
}
