package lesson41OverloadedConstructors;

public class OverloadedConstructors {
    public static void main(String[] args) {

        // Overloaded constructors = allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialised in various ways.

        User user = new User();
        User user1 = new User("John");
        User user2 = new User("Steve", "steve@live.com");
        User user3 = new User("Liam", "liamsprives@aol.com", 23);

        System.out.println(user.username);
        System.out.println(user.email);
        System.out.println(user.age);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

    }
}
