package lesson48Abstraction;

public class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    //need to override here because it was earlier declared in the abstract parent
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

}
