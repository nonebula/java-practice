package lesson35TwoDArrays;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {

        //2D array = also known as multidimensional arrays
        //An array where each element is an array
        //Useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        for(String[] foods: groceries) {
            for(String food: foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        String[][] beverages = {{"water", "soda", "squash"},
                {"red wine", "white wine", "rose"},
                {"beer", "IPA", "cider"}};

        for(String[] drinks: beverages) {
            for(String beverage: drinks) {
                System.out.print(beverage + " ");
            }
            System.out.println();
        }

        //first index = row, second index = column
        groceries[0][0] = "pineapple";
        groceries[0][1] = "grapefruit";
        groceries[1][0] = "potato";

        char[][] telephone = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'},
        };

        for(char[] row : telephone) {
            for(char number: row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
