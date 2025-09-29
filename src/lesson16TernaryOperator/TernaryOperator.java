package lesson16TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {

        //ternary operator (?) = return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue: ifFalse;
        // simpler version of if/else statement

        int score = 70;

        //These two are the same. Normal if/else:
        if(score >= 60) {
            System.out.println("The score is a PASS");
        } else {
            System.out.println("The score is a FAIL");
        }

        //ternary approach:
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);


        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);


        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);


        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
