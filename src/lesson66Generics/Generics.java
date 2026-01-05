package lesson66Generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface or method that is compatible with different data types
        // <T> / <T, U> type parameter (placeholder that gets replaced with a real type)
        // T U V W.... generics follow alphabet after T
        // <String> type argument (specifies the type). <Integer>, <Boolean> etc

        ArrayList<String> fruits = new ArrayList<>(); // type argument has been specified here. Generics specified in initial creation of ArrayList (cmd + click to see)
        //Type parameters: <E> – the type of elements in this list

        Box<String> box1 = new Box<>();
        box1.setItem("Apple");
        System.out.println(box1.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(2);
        System.out.println(box2.getItem());

        Box<Double> box3 = new Box<>();
        box3.setItem(3.14);
        System.out.println(box3.getItem());

        Box<Boolean> box4 = new Box<>();
        box4.setItem(true);
        System.out.println(box4.getItem());

        Product<String, Double> product = new Product<>("Shoes", 3.45);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

    }
}
