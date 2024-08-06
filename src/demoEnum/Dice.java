package demoEnum;

import java.util.Random;

public enum Dice {
    D4(4),
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    private int value;

    Dice(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int roll(){
        Random random = new Random();
        return random.nextInt(this.value)+1;
    }

    public int roll(int nbRolls){
        int sum = 0;
        for (int i = 0; i < nbRolls; i++) {
            sum += this.roll();
        }
        return sum;
    }
}
