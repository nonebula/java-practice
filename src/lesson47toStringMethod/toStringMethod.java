package lesson47toStringMethod;

public class toStringMethod {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class
        // Used to return a string representation of an object
        // By default, it returns a hash code as a unique identifier
        // It can be overridden to provide meaningful details

        Car car1 = new Car("Ford", "Mustang", 2025, "red");
//        System.out.println(car); would return a hash code here.

        Car car2 = new Car("Dodge", "Viper", 1999, "blue");

        //convoluted approach
        System.out.println(car1.color + " " + car1.model + " " + car1.make + " " + car1.year);

        System.out.println(car1);
        System.out.println(car2);

    }
}
