package lesson24BreakAndContinue;

public class BreakAndContinue {
    public static void main(String[] args) {

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++) {

            if(i == 5){
                break;
            }

            System.out.print(i + " ");
        }

        for(int i = 0; i < 10; i++) {

            if(i == 5){
                continue;
            }

            System.out.print(i + " ");
        }

    }
}
