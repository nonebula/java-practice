package lesson45SuperKeyword;

public class Person { // superclass (parent)

    String first;
    String last;

    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }

}
