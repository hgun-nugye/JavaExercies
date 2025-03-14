import java.util.*;

public class Cau9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần phân tích: ");
        int so = sc.nextInt();

        System.out.println("Số sau khi được phân tích: ");
        for (int i = 2; i <= so; i++) {
            while (so % i == 0) {
                System.out.print(i + " ");
                so /= i;
            }
        }

    }
}
