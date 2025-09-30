package lesson26Methods;

public class Methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        String name = "John";
        int age = 25;

        happyBirthday(name, age);
        happyBirthday2(name, age);

        double result = square(3);
        System.out.println(result);

        double resultCube = cube(3);
        System.out.println(resultCube);

        String fullName = getFullName("James", "Clifton");
        System.out.println(fullName);

        if(ageCheck(age)){
            System.out.println("You are old enough to vote!");
        } else {
            System.out.println("You must be 18+ to vote!");
        }

        //return type (void here), descriptive name, parentheses, then curly braces
    }

    //pass arguments between values
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you.");
        System.out.println("Happy  Birthday to you.");
        System.out.printf("Happy Birthday dear %s.\n", name);
        System.out.println("Happy Birthday to you!");
        System.out.printf("You are %d years old!!\n", age);
    }

    //order and datatype must match but names don't necessarily have to. For example:
    static void happyBirthday2(String birthdayboi, int yearsoflife){
        System.out.println("Happy Birthday to you.");
        System.out.println("Happy  Birthday to you.");
        System.out.printf("Happy Birthday dear %s.\n", birthdayboi);
        System.out.println("Happy Birthday to you!");
        System.out.printf("You are %d years old!!\n", yearsoflife);
    }

    //void name used if not returning a datatype
    //since we're calling a method that's not static from another static method we need to add this to run. Revisited in future.

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age){
        return age >= 18;
    }

}
