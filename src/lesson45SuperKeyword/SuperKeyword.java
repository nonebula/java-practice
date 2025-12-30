package lesson45SuperKeyword;

public class SuperKeyword {
    public static void main(String[] args) {

        // super = Refers to the parent class [when using inheritance, essentially just means 'parent'] (subclass <- superclass)
        // Used in constructors and method overriding
        // Calls in the parent constructor to initialise attributes

        Person person = new Person("Tom", "Riddle");
        person.showName();

        Student student = new Student("Harry", "Potter", 4.9);
        student.showGPA();

        Employee employee = new Employee("Rubeus", "Hagrid", 50000);
        employee.showSalary();

    }
}
