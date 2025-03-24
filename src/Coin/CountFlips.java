package Coin;

import java.util.Random;

public class CountFlips {
    public static void main(String[] args) {
        Random rd = new Random();
        Coin c = new Coin();
        int countHeads = 0;
        int countTails = 0;
        for (int i = 1; i <= 1000; i++) {
            c.getFace();
            if (c.isHeads()) countHeads++;
            else countTails++;
        }
        System.out.println("The times face is headss: " + countHeads);
        System.out.println("The times face is tails: " + countTails);
    }

}
