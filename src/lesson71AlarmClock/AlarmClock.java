package lesson71AlarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {

        // JAVA ALARM CLOCK
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "src/OnTheFlip-TheGreyRoom_DensityTime.wav";

        while(alarmTime == null) {
            try {
                System.out.print("Enter an alarm time(HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for: " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use: HH:MM:SS");
            }
        }

        Alarm alarm = new Alarm(alarmTime, filePath, scanner); //scanner passed over to other class
        Thread alarmThread = new Thread(alarm); // can do this as it implements the Runnable interface
        alarmThread.start();

        //scanner.closer()
    }
}
