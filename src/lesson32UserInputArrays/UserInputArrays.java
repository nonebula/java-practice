package lesson32UserInputArrays;

import java.util.Scanner;
import java.util.Arrays;

public class UserInputArrays {
    public static void main(String[] args) {

        //once a size is set you usually can't change this
        //String[] foods = {"pizza", "chicken", "tacos", "burger"};

        //must set a size before setting any inputs to the array
        //String[] foods = {};
        //foods[0] = "pizza";

        //array instantiated
        String[] foods = new String[3];
        //values added
        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "burger";

        for(String food : foods) {
            System.out.println(food);
        }

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        String[] foods2;
        int size;

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        //needed to clear up the scanner as we're taking an int and then a string
        scanner.nextLine();

        foods2 = new String[size];

        for(int i = 0; i < foods2.length; i++) {
            System.out.print("Enter a food: ");
            foods2[i] = scanner.nextLine();
        }

        //utilising 'toString' prints out full array here:
        System.out.println(Arrays.toString(foods2));

        //close scanner
    }
}
