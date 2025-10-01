package lesson33SearchAnArray;

import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4};

        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();
        //system buggy if no nextLine added in here:
        scanner.nextLine();

        boolean isFound = false;

        //performing a linear search with a for loop
        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        } //if the condition is never met, nothing is done. Added boolean to consider it.

        if(!isFound){
            System.out.println("Element not found...");
        }

        String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"};

        System.out.print("Enter a fruit to search for: ");
        String fruitTarget = scanner.nextLine();

        boolean isFruitFound = false;

        for (int i = 0; i < fruits.length; i++){
            if(fruitTarget.equals(fruits[i])){ //built in equals method needed for comparison because String is a reference datatype
                System.out.println("Element found at index: " + i);
                isFruitFound = true;
                break;
            }
        }

        if(!isFruitFound){
            System.out.println("Element not found...");
        }

        //close scanner
    }
}
