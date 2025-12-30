package lesson52GettersAndSetters;

public class Car {

    private final String model; //use of final will not allow future modifications beyond this point. i.e. people will not be able to add new models
    private String color;
    private int price;
    //private access means they cannot be accessed casually now

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "£" + this.price;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if(price < 0) {
            System.out.println("Price cannot be less than 0.");
        } else {
            this.price = price;
        }
    }
}
