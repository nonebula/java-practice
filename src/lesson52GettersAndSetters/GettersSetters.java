package lesson52GettersAndSetters;

public class GettersSetters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE
        // SETTERS = Methods that make a field WRITEABLE

        Car car = new Car("Charger", "yellow", 10000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

        car.setColor("blue");
        car.setPrice(20000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

        car.setColor("green");
        car.setPrice(-100); // breaks condition, stays as preset value and doesn't change

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

    }
}
