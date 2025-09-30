package lesson29BankingProgram;

import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Beginner banking program in Java

        //Declare variables
        double balance = 1232.34;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            //Display menu
            System.out.println("*******************");
            System.out.println("Welcome to Banking Program!");
            System.out.println("*******************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            System.out.println("*******************");

            //Get and Process user choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice!");
            }
        }

        //Exit message
        System.out.println("**************************************");
        System.out.println("Thank you for using the Banking Program!");
        System.out.println("**************************************");

        //close scanner
    }

    //showBalance()
    static void showBalance(double balance) {
        System.out.println("*******************");
        System.out.printf("Your balance is £%.2f\n", balance);
    }

    //deposit()
    static double deposit() {
        double amount;

        System.out.print("Please enter the amount you would like to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0.01) {
            System.out.println("Amount must be a positive number!");
            return 0.0;
        } else {
            return amount;
        }
    }

    //withdraw()
    static double withdraw(double balance) {
        double amount;

        System.out.print("Please enter the amount you would like to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("You have insufficient funds to withdraw this amount!");
            return 0.0;
        } else if (amount < 0.01){
            System.out.println("Amount cannot be a negative number!");
            return 0.0;
        } else {
            return balance - amount;
        }
    }
}
