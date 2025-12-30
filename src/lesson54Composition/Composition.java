package lesson54Composition;

public class Composition {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        // For example, an engine is "part-of" a car.
        // Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette", 2025, "V8"); //If deleted, engine will also be deleted and access will be broken

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type); //prints the object hashed ID instead of anything useful without .type

        car.start();

    }
}
