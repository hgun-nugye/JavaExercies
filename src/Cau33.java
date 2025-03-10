import java.util.Scanner;

public class Cau33 {
    public static boolean parlindrom(String str) {
        StringBuilder res = new StringBuilder(str);//res được khởi tạo chứa luôn strs
        return str.equals(res.reverse().toString());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        String str = sc.nextLine();
        if (parlindrom(str))
            System.out.println("Chuỗi này là chuỗi parlindrom!");
        else System.out.println("Chuỗi này không phải chuỗi parlindrom!");
        sc.close();
    }
}
