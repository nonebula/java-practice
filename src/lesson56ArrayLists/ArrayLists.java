package lesson56ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing).
        // Arrays are fixed in size, but ArrayLists can change (they're dynamic).

        // <> = diamond operator -> generics
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);

        ArrayList<Double> list2 = new ArrayList<>();

        list2.add(3.23);
        list2.add(1.33);
        list2.add(2.44);

        System.out.println(list2);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Pear");

        System.out.println(fruits);

        fruits.remove(1);
        System.out.println(fruits);

        fruits.set(0, "Pineapple");
        System.out.println(fruits);

        System.out.println(fruits.get(2));

        System.out.println(fruits.size());

        Collections.sort(fruits);

        for(String fruit : fruits) {
            System.out.println(fruit);
        }



        //Activity
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Please enter the number of foods you would like to add: ");
        int numOfFoods = scanner.nextInt();

        scanner.nextLine();

        for(int i = 0; i < numOfFoods; i++) {
            System.out.println("Enter food #" + (i + 1) + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        //close scanner
        //scanner.close()
    }
}
