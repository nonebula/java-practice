package lesson27OverloadedMethods;

import java.util.Scanner;

public class OverloadedMethods {
    public static void main(String[] args) {

        //Overloaded methods = methods that share the same name,
            //but different parameters
            //signature = name + parameters (each must be unique but can share same name)

        System.out.println(add(1,2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4));

        String pizza = bakePizza("flatbread", "mozzarella", "bacon");
        System.out.println(pizza);

    }

    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
    static double add (double a, double b, double c, double d) {
        return a + b + c + d;
    }

    static String bakePizza(String bread){
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String meat){
        return meat + " " + cheese + " " + bread + " pizza";
    }
}
