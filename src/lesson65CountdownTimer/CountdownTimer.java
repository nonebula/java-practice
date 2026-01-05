package lesson65CountdownTimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {

        //Java COUNTDOWN TIMER PROGRAM
        // Mini project to illustrate use of timer

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            //Done as anonymous task as this is a one time use, not multi-use

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0){
                    System.out.println("Happy New Year!!");
                    timer.cancel(); // ends things, otherwise will run indefinitely
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); //task, delay, period


    }
}
