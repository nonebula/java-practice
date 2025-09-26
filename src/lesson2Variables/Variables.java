package lesson2Variables;

public class Variables {
    public static void main(String[] args) {
        //2.Variables

        //variable = a reusable contain for a value. A variable behaves as if it was the value it contains

        /*Primitive = simple value stored directly in memory (stack)
         *   int
         *   double
         *   char
         *   boolean
         *   byte
         *   short
         *   long
         *   float
         *   void
         * "I'm giving you 10 dollars" */

        /*Reference = memory address (stack) that points to the (heap)
         *   string
         *   array
         *   object
         * "I'm giving you an IOU for 10 dollars" */

        //In java, 2 steps to creating a variable: 1. declaration 2. assignment

        //Primitives
        int age = 21;
        System.out.println(age);

        double weight = 3.5;
        System.out.println(weight);

        //single quotes used
        char gender = 'M';
        System.out.println(gender);

        boolean isHappy = true;
        if (isHappy) {
            System.out.println("You are happy");
        } else {
            System.out.println("You are not happy");
        }

        //References
        //double quotes over single quotes
        String name = "Steve";
        System.out.println(name);
        System.out.println("Hello " + name);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old " + "and you weigh " + weight + "kg");
    }
}