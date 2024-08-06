package demoEnum;

import java.util.Random;

public class DemoEnum {
    public static void main(String[] args) {
        System.out.println(Dice.D6.roll());
    }

    public static int roll(Dice dice){
        Random rand = new Random();
        return rand.nextInt(dice.getValue()) + 1;
    }
}
