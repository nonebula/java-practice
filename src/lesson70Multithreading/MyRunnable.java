package lesson70Multithreading;

public class MyRunnable implements Runnable {

    private final String text;

    MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName()+": "+i);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println("The Thread was interrupted");
            }
        }
    }

}
