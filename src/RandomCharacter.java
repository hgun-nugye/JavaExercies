import java.util.*;

public class RandomCharacter {

    public static char getRandomCharacter(char ch1, char ch2) {
        Random rd = new Random();
        return (char) ((char) (rd.nextInt(ch2 - ch1) + 1) + ch1);
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        Random rd = new Random();
        return (char) ('0' + rd.nextInt(10));
    }

    public static char getRandomCharacter() {
        Random rd = new Random();
        int choice = rd.nextInt(3);
        switch (choice) {
            case 0:
                return getRandomLowerCaseLetter();
            case 1:
                return getRandomUpperCaseLetter();
            case 2:
                return getRandomDigitCharacter();
            default:
                return ' ';
        }
    }

    public static void main(String[] args) {
        // tạo 175 ký tự thường ngẫu nhiên và in ra màn hình, mỗi hàng 25 ký tự.
        int count = 0;
        for (int i = 0; i < 175; i++) {
            System.out.print(getRandomLowerCaseLetter() + " ");
            count++;
            if (count == 25) {
                System.out.println();
                count = 0;
            }
        }
    }
}
