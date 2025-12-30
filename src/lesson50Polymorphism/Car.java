package lesson50Polymorphism;

public class Car extends Vehicle { //could also do implements if there was a 'vehicle' interface

    @Override
    void go() {
        System.out.println("You drive the car");
    }
}
