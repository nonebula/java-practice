package lesson9MathClass;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        //PI & Math class already predefined
        System.out.println(Math.PI);
        System.out.println(Math.E); //Exponential constant, Euler's number

        double result;

        result = Math.pow(2, 3); //2 to the power of 3
        System.out.println(result);

        result = Math.abs(-5); //absolute value of 5 = 5. Distance away from zero
        System.out.println(result);

        result = Math.sqrt(9); //square root method
        System.out.println(result);

        result = Math.round(3.14); //round to the nearest whole integer
        System.out.println(result);

        result = Math.ceil(3.14); //round up to ceiling int
        System.out.println(result);

        result = Math.floor(3.14); // round down to the floor int
        System.out.println(result);

        result = Math.max(2,10); // max between two values/variables
        System.out.println(result);

        result = Math.min(2,10); // min between two values/variables
        System.out.println(result);

        //Math exercises

        //Hypotenuse c = Math.sqrt(a^2 + b^2)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        //circumference

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.2fcm\n" , circumference);
        System.out.printf("The area is: %.2fcm^2\n" , area);
        System.out.printf("The volume is: %.2fcm^3\n" , volume);

        //close scanner
    }
}
