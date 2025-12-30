package lesson43StaticKeyword;

public class StaticKeyword {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class rather than to any specific object
        // Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Kyle");
        Friend friend2 = new Friend("Jack");

        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);

        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends); //always going to be 1 because is relative to zero. Using static can alter this
        //static will cause them all to share each total

        Friend friend3 = new Friend("Lily");
        System.out.println(friend3.name);
        System.out.println(Friend.numOfFriends);
        // better to access the static member by using the name of the class rather than any object
        // this highlights that it is static

        Math.round(3.99);
        //This is another demonstration of a static method
        // cmd + click then search round to see the static round method in action

    }
}
