package lesson25NestedLoops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // nested loop = a loop inside another loop
        // Used often with matrices or Data Structures & Algorithms

        for(int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol of choice: ");
        symbol = scanner.next().charAt(0);

        //out for loop for rows, inner for loop for columns:
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        //close scanner
    }
}
