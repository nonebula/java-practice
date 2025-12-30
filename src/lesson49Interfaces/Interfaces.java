package lesson49Interfaces;

public class Interfaces {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define
        // Supports multiple inheritance-like behaviours

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        // You can implement more than one interface (multiple extensions)

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

    }
}
