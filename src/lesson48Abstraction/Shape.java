package lesson48Abstraction;

public abstract class Shape { // cannot make an instance of shape, can only extend

    abstract double area(); // will require its children to implement this method

    void display() { // concrete method: inherited by children, no overriding needed
        System.out.println("This is a shape");
    }

}
