package lesson55WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean) to be used as objects.
        // "Wrap them in an object"
        // Generally, don't wrap primitives unless you need an object.
        // Allows use of Collections Framework and static Utility Methods

        //This example is deprecated but useful for illustration purposes. Autoboxing now the preferred approach

        // int a = 123;

        /*

        Integer a = new Integer(123);
        Double b = new Double(2.34);
        Character c = new Character('$');
        Boolean d = new Boolean(true);

        */

        //Autoboxing
        Integer a = 123;
        Double b = 2.34;
        Character c = '$';
        Boolean d = true;
        String e = "Pizza";
        //All reference data types and objects

        //Unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean p = d;

        //utility methods utilising wrapper classes
        String aa = Integer.toString(123);
        String ab = Double.toString(2.34);
        String ac = Character.toString('$');
        String ad = Boolean.toString(true);

        String xx = aa + ab + ac + ad;
        System.out.println(xx);

        int ba = Integer.parseInt("123");
        double bb = Double.parseDouble("2.34");
        char bc = "Pizza".charAt(0);
        boolean bd = Boolean.parseBoolean("true");

        // String yy = ba + bb + bc + bd; WILL NOT WORK DUE TO DIFFERENT TYPES

        char letter = 'k';
        System.out.println(Character.isLetter(letter)); // returns boolean true or false (verifying user input etc)
        char notLetter = '$';
        System.out.println(Character.isLetter(notLetter)); // returns boolean true or false (verifying user input etc)

        System.out.println(Character.isUpperCase(letter));
        //Many others like this exist

    }
}
