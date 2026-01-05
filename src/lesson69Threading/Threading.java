package lesson69Threading;

import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {

        // Threading = Allows a program to run multiple tasks simultaneously
        // Helps improve performance with time-consuming operations
        // File I/O, network communications, or any background tasks

        // How to create a Thread:
            // Option 1. Extend the Thread class (simpler)
            // Option 2. Implement the Runnable interface (better)

        // What we're running on here is the Main Threa, would usually look something like this:
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 5 seconds to enter your name");

        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("The Thread was interrupted");
            }

            if(i == 5){
                System.out.println("Time is up!");
            }
        }
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        scanner.close();

        Thread is confused and this won't really work as intended
        */

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 10 seconds to enter your name");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
}
