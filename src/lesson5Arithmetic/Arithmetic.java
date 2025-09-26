package lesson5Arithmetic;

public class Arithmetic {
    public static void main(String[] args) {

        //arithmetic operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        System.out.println(z);

        z = x - y;
        //System.out.println(z);

        z = x * y;
        //System.out.println(z);

        z = x / y;
        //System.out.println(z);

        z = x % y;
        //System.out.println(z);


        //Augmented assignment operators:

        int xx = 10;
        int yy = 3;

        xx += yy; // = x = x + y

        xx -= yy; // = x = x - y

        xx *= yy; // = x = x * y

        xx /= yy; // = x = x / y //Integer division will not allow remainders; doubles would be better for specifics

        xx %= yy; // = x = x % y

        System.out.println(xx);


        //Increment and decrement operators

        int xxx = 1;
        xxx ++;     //xxx = x + 1
        xxx --;     //xxx = x - 1

        //ORDER OF OPERATIONS = [P-E-M-D-A-S]
        //Parentheses, Exponents, Multiplication, Division, Addition, Subtraction
        //PLEASE EXCUSE MY DOPE ASS SWAG

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}
