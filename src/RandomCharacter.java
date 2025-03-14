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
        return (char) ((char) rd.nextInt(126 - 32 + 1) + 32);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Nhập vào giới hạn trái: ");
        str = sc.nextLine();
        char ch1 = str.charAt(0);
        System.out.println("Nhập vào giới hạn phải: ");
        str = sc.nextLine();
        char ch2 = str.charAt(0);
        System.out.print("Đây là kí tự ngẫu nhiên trong khoảng cho trước: ");
        System.out.println(getRandomCharacter(ch1, ch2));

        System.out.print("\nĐây là kí tự viết thường ngẫu nhiên: ");
        System.out.println(getRandomLowerCaseLetter());

        System.out.print("\nĐây là kí tự viết hoa ngẫu nhiên: ");
        System.out.println(getRandomUpperCaseLetter());

        System.out.print("\nĐây là kí tự số ngẫu nhiên: ");
        System.out.println(getRandomDigitCharacter());

        System.out.print("\nĐây là kí tự ngẫu nhiên được tạo: ");
        System.out.println(getRandomCharacter());
        sc.close();
    }
}
