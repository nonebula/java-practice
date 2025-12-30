package lesson50Polymorphism;

public class Boat extends Vehicle { //could also do implements if there was a 'vehicle' interface

    @Override
    void go() {
        System.out.println("You sail the boat");
    }

}
