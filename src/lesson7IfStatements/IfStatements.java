package lesson7IfStatements;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        //if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        //to add emojis = ctrl + cmd + space

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter any name.");
        } else {
            System.out.println("Hello " + name + "!");
        }

        //GROUP 2
        if(age > 65){
            System.out.println("You are a senior. 👴");
        }
        else if(age < 0) {
            System.out.println("You haven't been born yet. ❌");
        }
        else if(age > 12 && age < 20) {
            System.out.println("You are a teenager. 👦");
        }
        else if(age == 0) {
            System.out.println("You are a baby. 👶");
        }
        else if(age >= 20 && age < 65){
            System.out.println("You are an adult. 🧑");
        }
        else {
            System.out.println("You are not an adult. ❌🧑");
        }

        //GROUP 3
        if (isStudent){
            System.out.println("You are a student. 🧑‍🎓");
        } else {
            System.out.println("You are not a student. ❌🧑‍🎓");
        }

        //close scanner
    }
}
