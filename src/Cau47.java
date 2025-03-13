import java.util.Scanner;

public class Cau47 {
    public static String replace(String x, String y, String z) {
        if (x.contains(y)) {
            x = x.replace(y, z);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi ban đầu: ");
        String x = sc.nextLine();
        System.out.print("Nhập vào chuỗi cần thay thế: ");
        String y = sc.nextLine();
        System.out.print("Nhập vào chuỗi để thay thế: ");
        String z = sc.nextLine();
        System.out.print("Đây là chuỗi đã được thay thế: ");
        System.out.println(replace(x, y, z));
        sc.close();

    }
}
