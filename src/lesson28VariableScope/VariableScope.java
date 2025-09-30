package lesson28VariableScope;

public class VariableScope {

    static int x = 3; //class based. Like a neighbour walking down the street that the others can see from their window

    public static void main(String[] args) {

        // variable scope = where a variable can be accessed

        //local scope

        int x = 1;
        System.out.println(x);

        //variable defined inside of a method has a LOCAL scope. Inaccessible outside of here.

        //these two methods cannot see into each others' houses but can see in their own or out the window.
    }

    static void doSomething(){
        int x = 2;
        System.out.println(x);

        //separate method and so doesn't have access to the same named method in the other method. LOCAL scope again.
    }
}
