package lesson50Polymorphism;

public class Motorbike extends Vehicle { //could also do implements if there was a 'vehicle' interface

    @Override
    void go() {
        System.out.println("You ride the motorbike");
    }
}
