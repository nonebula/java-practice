package lesson63AnonymousClasses;

public class AnonymousClasses {
    public static void main(String[] args) {

        // Anonymous class = A class that doesn't have a name. It cannot be reused.
        // Enables you to add custom behaviour without having to create a new class.
        // Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();

        dog1.speak();

        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();
        //inefficient and not as useful for single use scenarios
        // instead of the above, we just create an anonymous class (would delete the talkingDog class and object etc and do the below instead.

        Dog dog2 =  new Dog(){
            @Override
            void speak() {
                System.out.println("Scooby Doo says RUH ROH RAGGY!");
            }
        };

        dog1.speak();
        dog2.speak();

        //If it needs to be reused, better off creating a new class/object

    }
}
