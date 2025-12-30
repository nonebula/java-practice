package lesson45SuperKeyword;

public class Student extends Person {

    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last); //any arguments in the parent
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + " " + this.last + "'s GPA is: " + this.gpa);
    }

}
