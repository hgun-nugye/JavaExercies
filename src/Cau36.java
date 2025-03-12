import java.util.*;

public class Cau36 {
    public static long fib1(long index) {
        if (index == 0) return 0;
        if (index == 1) return 1;
        else {
            return fib1(index - 1) + fib1(index - 2);
        }
    }

    public static long fib2(long index) {
        long be = 0, af = 1;
        if (index == 0) return be;
        if (index == 1) return af;
        else {
            for (int i = 2; i <= index; i++) {
                long tem = be;
                be = af;
                af += tem;
            }
        }
        return af;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào vị trí index cần xác định số fibo: ");
        long n = sc.nextLong();
        String str1 = Long.toString(fib1(n));
        String str2 = Long.toString(fib2(n));
        System.out.println("\nDùng đệ quy: ");
        System.out.println("Số fibo thu " + n + " la " + str1);
        System.out.println("\nDùng vòng lặp: ");
        System.out.println("Số fibo thu " + n + " la " + str2);
        sc.close();
    }
}
