package lesson46MethodOverriding;

public class Fish extends Animal {

    @Override //good practice to add the annotation to illustrate the overriding
    //overridden methods take precedents lower down the chain/flow
    // incorrect spelling etc will identify that this is not overriding anything. Annotation adds checks and balances
    void move() {
        System.out.println("This animal is swimming!");;
    }
}
