package lesson70Multithreading;

public class Multithreading {
    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        // (Thread = A set of instructions that run independently)
        // Useful for background tasks or time-consuming operations

//        MyRunnable myRunnable = new MyRunnable(); Could do this way but can also do anonymously like below

        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");
        thread1.start();
        thread2.start();
        System.out.println("GAME END!"); //running here WILL NOT wait for the threads to finish.

        try{
            thread1.join();
            thread2.join();
        } catch(InterruptedException e){
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME END!"); //running here WILL wait for the threads to finish.

    }
}
