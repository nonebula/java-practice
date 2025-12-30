package lesson48Abstraction;

public class Abstraction {
    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        // Abstraction is the process of hiding implementation details and showing only the essential features
        // Abstract classes CAN'T be instantiated directly
        // Can contain 'abstract' methods (which must be implemented) - the shape
        // Can contain 'concrete' methods (which are inherited)

        // Shape shape = new Shape(); error message will show here, will not allow us to create an instance of an abstract class

        //we can create instances of the below which extend the 'shape' class
        Circle circle = new Circle(2.3);
        Triangle triangle = new Triangle(2.3, 3.5);
        Rectangle rectangle = new Rectangle(3.6, 6.7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Area of the triangle: " + triangle.area());
        System.out.println("Area of the rectangle: " + rectangle.area());

    }

}
