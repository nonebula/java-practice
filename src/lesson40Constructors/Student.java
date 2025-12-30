package lesson40Constructors;

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    //params don't need to be named the same. Is best practice though.
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study() {
        System.out.println("Student " + name + " is studying");
    }

}
