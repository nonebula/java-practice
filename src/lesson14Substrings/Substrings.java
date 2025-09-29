package lesson14Substrings;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        // substring = a method used to extract a portion of a string
        // string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email = "mangoapplegrapes@youremail.com";

        //first index inclusive, second exclusive
        String username = email.substring(0, email.indexOf("@"));

        System.out.println("Username: " + username);

        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println("Domain: " + domain);


        //User input
        String userEmail;
        String userLogin;
        String userDomain;

        System.out.print("Enter your email: ");
        userEmail = scanner.nextLine();

        if(userEmail.contains("@")) {
            userLogin = userEmail.substring(0, userEmail.indexOf("@"));
            userDomain = userEmail.substring(userEmail.indexOf("@") + 1);

            System.out.println("Username: " + userLogin);
            System.out.println("Domain: " + userDomain);
        } else {
            System.out.println("Emails must contain @");
        }

        //close scanner
    }
}
