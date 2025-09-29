package lesson10Printf;

public class Printf {
    public static void main(String[] args) {

        // printf() = a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5; //f for doubles or other floating point numbers
        boolean isEmployed = true;

        //new line characters need to be manually added
        System.out.printf("Hello, %s\n", name);
        System.out.printf("Your name starts with, %c\n", firstLetter);
        System.out.printf("You are, %d years old\n", age);
        System.out.printf("You are, %.1fcm tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        //inserting multiple
        System.out.printf("%s is %d years old\n", name, age);

        double price1 = 9.99;
        double price2 = 123.42;
        double price3 = -55.01;

        //6 digits displayed as default. Precision needed
        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);

        //flags
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers enclosed in ()
        // space = display a minus if negative, space if positive

        // + = output a plus
        double price4 = 9.99;
        double price5 = 123.42;
        double price6 = -55.01;
        System.out.printf("%+.1f\n", price4);
        System.out.printf("%+.2f\n", price5);
        System.out.printf("%+.3f\n", price6);

        // , = comma grouping separator
        double price7 = 9999.99;
        double price8 = 12321312.42;
        double price9 = -54125.01;
        System.out.printf("%,.1f\n", price7);
        System.out.printf("%,.2f\n", price8);
        System.out.printf("%,.3f\n", price9);

        // ( = negative numbers enclosed in ()
        double price10 = -979.99;
        double price11 = 123.42;
        double price12 = -55.01;
        System.out.printf("%(.1f\n", price10);
        System.out.printf("%(.2f\n", price11);
        System.out.printf("%(.3f\n", price12);

        // space = display a minus if negative, space if positive
        double price13 = 9.99;
        double price14 = 123.42;
        double price15 = -55.01;
        System.out.printf("% .1f\n", price13);
        System.out.printf("% .2f\n", price14);
        System.out.printf("% .3f\n", price15);


        //Width

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 426;
        int id4 = 5031;

        //04 because 4 digits is our largest integer size
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        //4 because this pads to 4 with the number (empty spaces rather than 4)
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        //-4 because this pads to 4 with the number (empty spaces)
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}
