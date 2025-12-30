package lesson39Objects;

import java.util.Random;
import java.util.Scanner;

public class Objects {
    public static void main(String[] args) {

        // Object = An entity that holds data (attributes)
        //      and can perform actions (methods)
        //      It is a reference data type, stored in heap

        //class used as a blueprint to create objects

        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car();

        System.out.println(car1); // won't print properly out, will only return the object

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.isRunning);

        car1.start();
        car1.stop();

    }
}
