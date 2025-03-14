import java.util.Scanner;

public class Cau14 {
    public static void PatternI(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void PatternII(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void PatternIII(int n) {
        for (int i = n; i >= 1; i--) {
            int a = i - 1;
            for (int j = 1; j <= a; j++) {
                System.out.print("  ");
            }
            for (int j = n - a; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void PatternIV(int n) {
        for (int i = 1; i <= n; i++) {
            int a = i - 1;
            for (int j = 1; j <= a; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số n: ");
        int n = sc.nextInt();

        PatternI(n);
        System.out.println();
        PatternII(n);
        System.out.println();
        PatternIII(n);
        System.out.println();
        PatternIV(n);

        sc.close();
    }
}
