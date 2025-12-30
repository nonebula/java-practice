package lesson50Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        // Objects can identify as other objects
        // Objects can be treated as objects of a common superclass
        // Can also be achieved through using interfaces

        Car car = new Car();
        Motorbike motorbike = new Motorbike();
        Boat boat = new Boat();

        car.go();
        motorbike.go();
        boat.go();

//        Car[] cars = {car, motorbike, boat}; incompatible errors, type errors

        Vehicle[] vehicles = {car, motorbike, boat}; // all identify as vehicles so can be stored in an array of vehicles

        for(Vehicle vehicle : vehicles) {
            vehicle.go();
        }

    }
}
