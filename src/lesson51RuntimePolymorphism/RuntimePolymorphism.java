package lesson51RuntimePolymorphism;

import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {

        // Runtime Polymorphism = when the method that gets executed is decided at runtime based on the actual type of the object
        // AKA Dynamic Polymorphism

        // Animal animal = new Animal() cannot be instantiated because it is declared abstract

        Scanner scanner = new Scanner(System.in);

        Animal animal;
        //will assign based on user input

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if(choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("Invalid choice.");
        }

    }
}
