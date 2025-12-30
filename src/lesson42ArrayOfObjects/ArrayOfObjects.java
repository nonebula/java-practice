package lesson42ArrayOfObjects;

public class ArrayOfObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Mustang", "red");
        Car car2 = new Car("Corvette", "blue");
        Car car3 = new Car("Charger", "yellow");

        //Car[] cars = new Car[3];
        Car[] cars = {car1, car2, car3};

//        for(int i = 0; i < cars.length; i++) {
//            cars[i].drive();
//        }

        //these are the same. Below is an enhanced 'for' loop (more efficient).

        for (Car car : cars) {
            car.drive();
        }

        //passing in anonymous objects

        Car[] cars2 = {
                new Car("Mustang", "red"),
                new Car("Corvette", "blue"),
                new Car("Charger", "yellow")
        };

        for (Car car : cars2) {
            car.color = "black";
        }

        for (Car car : cars2) {
            car.drive();
        }
    }
}
