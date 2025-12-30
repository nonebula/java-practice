package lesson43StaticKeyword;

public class Friend {

    static int numOfFriends;
    //this belongs to the friend class and all objects have access to it
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends ++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends");
        //no 'this' needed because it is shared among the class and linked objects
    }
}
