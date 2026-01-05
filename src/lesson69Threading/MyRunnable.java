package lesson69Threading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("The Thread was interrupted");
            }

            if(i == 10){
                System.out.println("Time is up!");
                System.exit(0);
            }
        }
        //pasted from the other file, will run on separate thread
        // program doesn't exit until all threads are done unless daemon thread is used
    }

}
