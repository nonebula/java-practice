package lesson57ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        // Pop up in situations like: (Dividing by zero, file not found, mismatch input type)
        // Surround any dangerous code with a try{} block
        // try{}, catch{}, (and optionally) finally{}

        // System.out.println(1 / 0);
        //    Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	  at lesson57ExceptionHandling.ExceptionHandling.main(ExceptionHandling.java:11)

        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO MAAN!");
        }

        //anytime you accept user input it's dangerous code as anything could be input!
        try (Scanner scanner = new Scanner(System.in)) { //try with resources: better to do like this if resources are being used.
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO MAAN!");
        } catch (Exception e) { // catches all. Using this alone is bad practice, but using it as a final catchall is fine
            // safety net, better to catch and handle specific types of exceptions
            System.out.println("Something went wrong!");
        } finally {
            //executes with or without exceptions. Clean up resources etc (e.g. opening a file in the try block, closing in the finally block)
            //scanner.close();
            System.out.println("This always executes, goodbye!");
        }

    }
}
