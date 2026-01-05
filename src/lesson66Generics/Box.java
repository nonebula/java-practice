package lesson66Generics;

public class Box <T> {

    // reusable class

    T item;
    public void setItem (T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

}
