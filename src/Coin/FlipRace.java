package Coin;

public class FlipRace {
    public static void main(String[] args) {
        Coin coinComp = new Coin();
        Coin coinUser = new Coin();
        int countComp = 0;
        int countUser = 0;
        int countFlipComp = 0;
        int countFlipUser = 0;
        boolean result = true;
        while (result) {
            //máy ném đồng xu trước
            coinComp.getFace();
            countFlipComp++;
            if (coinComp.isHeads()) {
                countComp++;
            } else countComp = 0;
            //người chơi ném đồng xu sau
            coinUser.getFace();
            countFlipUser++;
            if (coinUser.isHeads()) {
                countUser++;
            } else countUser = 0;
            if (countComp == 3 || countUser == 3) result = false;
        }
        if (countComp > countUser) {
            System.out.printf("After %d times, Computer is Winner!", countFlipComp);
        } else if (countComp < countUser) {
            System.out.printf("After %d times, User is Winner!", countFlipUser);
        } else System.out.printf("After %d times, User and Computer are equal!", countFlipUser);

        System.out.println("\n\nThe number face is heads of Computer is " + countComp);
        System.out.println("The number face is heads of User is " + countUser);

    }

}
