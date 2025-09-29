package lesson17TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemperature;
        String unit;

        System.out.print("Enter your temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase(); //method chaining

        //ternary checks condition ? true : false
        newTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5) + 32;
        System.out.printf("New temperature: %.1fº%s", newTemperature, unit);

        //close scanner
    }
}
