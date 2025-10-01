package lesson31Arrays;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        // *** think of it as a variable that can store more than one value ***

        //arrays = reference data type. Below returns a memory address
        //index number needed for access
        String[] fruits = {"apple", "pear", "orange", "banana", "coconut"};
        System.out.println(fruits);

        //will print first element
        System.out.println(fruits[0]);
        //or second element... and so on
        System.out.println(fruits[1]);

        //Exception thrown if out of bounds as an 'out of bounds exception'

        fruits[0] = "pineapple";
        System.out.println(fruits[0]);
        //by specifying the index, you can change any element

        //if length needed array.length =
        int numOfFruits = fruits.length;

        //for loop to print all elements of an array
        for(int i = 0; i < numOfFruits; i++) {
            System.out.print(fruits[i] + " ");
        } System.out.println();

        //enhanced 'for' loop
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        } System.out.println();

        Arrays.sort(fruits);
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        } System.out.println();

        Arrays.fill(fruits, "pineapple");
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        } System.out.println();
    }
}
