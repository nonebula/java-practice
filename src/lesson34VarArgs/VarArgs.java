package lesson34VarArgs;

public class VarArgs {
    public static void main(String[] args) {

        //varargs - variable arguments
            // allow a method to accept a varying # of arguments
            // makes methods more flexible, no need for overloaded methods
            // java will pack the arguments into an array
            // ... (ellipsis)

        System.out.println(add(1,2,3,4));

        System.out.println(average(1,2,3,4));

    }


//i.e. something like this is redundant, and can be done as above instead:
    //    static double add(int a, int b){
    //        return a+b;
    //    };
    //    static double add(int a, int b, int c){
    //        return a+b+c;
    //    }
    //    static double add(int a, int b, int c, int d){
    //        return a+b+c+d;
    //    }
    //    static  double add(int a, int b, int c, int d, int e){
    //        return a+b+c+d+e;
    //    }
    //    static double add(int a, int b, int c, int d, int e, int f){
    //        return a+b+c+d+e+f;
    //    }
    //    static double add(int a, int b, int c, int d, int e, int f, int g){
    //        return a+b+c+d+e+f+g;
    //    }

    //this is farrr more efficient
    static int add(int... numbers) {
        int sum = 0;

        //this avoids any NaN issues
        if(numbers.length == 0) {
            return 0;
        }

        for(int number : numbers) {
            sum += number;
        }

        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;

        //this avoids any NaN issues
        if(numbers.length == 0) {
            return 0;
        }

        for(double number : numbers) {
            sum += number;
        }

        return sum/numbers.length;
    }

}
