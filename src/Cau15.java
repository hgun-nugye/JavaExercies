import java.util.Scanner;

public class Cau15 {
    public static String convertDecimalToBinary(int value) {
        StringBuilder bi = new StringBuilder();
        while (value != 0) {
            int mod = value % 2;
            bi.append(mod);
            value /= 2;
        }

        return bi.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần chuyển đổi sang hệ 2: ");
        int n = sc.nextInt();
        System.out.printf("Số %d được chuyển sang hệ 2 là %s",n,convertDecimalToBinary(n) );
        sc.close();
    }

}
