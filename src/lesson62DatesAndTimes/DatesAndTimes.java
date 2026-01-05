package lesson62DatesAndTimes;

import javax.swing.text.DateFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        //Custom format for date time
        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(dateTime2));

        //Custom DateTime object
        LocalDateTime dateTime3 = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
        System.out.println(formatter.format(dateTime3));

        LocalDateTime dateTime4 = LocalDateTime.of(2025, 6, 12, 11, 0, 0);
        System.out.println(formatter.format(dateTime4));

        if(dateTime3.isBefore(dateTime4)) {
            System.out.println("Date: " + dateTime3 + " is earlier than " + dateTime4);
        } else if(dateTime3.isAfter(dateTime4)) {
            System.out.println("Date: " + dateTime3 + " is later than " + dateTime4);
        } else if (dateTime3.isEqual(dateTime4)) {
            System.out.println("Date: " + dateTime3 + " is equal to " + dateTime4);
        } else {
            System.out.println("Who knows!");
        }

    }
}
