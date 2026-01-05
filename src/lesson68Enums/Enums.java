package lesson68Enums;

import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {

        // Enums = Enumerations
        // A special kind of class that represents a fixed set of constants.
        // They improve code readability and are easy to maintain
        // More efficient with switches when comparing Strings

        Day day = Day.SUNDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());

        //No need to string wrap as they are defined in enums
        switch(day) {
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY,
                 SUNDAY -> System.out.println("It is a weekend");
        }

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day dayOfWeek = Day.valueOf(response);

            switch(dayOfWeek) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is a weekend");
            }

    } catch (IllegalArgumentException e) {
            System.out.println("That is not a valid day");
        }
    }
}
