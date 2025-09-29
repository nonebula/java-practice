package lesson8RandomNumbers;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        //if no bound the range will be between around negative 2 billion & positive 2 billion

        //origin = inclusive, bound = exclusive (not included)
        number1 = random.nextInt(1,7);
        //bound only presets from 1 to bound
        number2 = random.nextInt(1000);
        number3 = random.nextInt(1,7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        double number4;
        number4 = random.nextDouble();
        System.out.println(number4);

        boolean isHeads;
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Heads");;
        } else {
            System.out.println("Tails");
        }
    }
}
