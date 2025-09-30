package lesson23ForLoops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of times

        //3 statements -
            // 1 = initialisation (counter, how many times have we iterated? common practice names it 'i', loop control variable)
            // 2 = condition (how long to continue for)
            // 3 = increment (increment or decrement by how much?)
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        for(int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i-=3) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++) {
            System.out.println(i);
        }


        //Countdown example

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); //intermediate Java
        }

        //InterrupedException typically occurs when a thread running the method is interrupted while it is sleeping, waiting, or otherwise paused in its execution

        System.out.println("Happy New Year!");


        //close scanner
    }
}
