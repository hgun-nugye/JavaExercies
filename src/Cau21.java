import java.util.Scanner;

public class Cau21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int top = -1;
        final int max = 100;
        int[] stack = new int[max];
        int n;
        do {

            System.out.println("Nhập vào số cần phân tích thành " +
                    "các thừa số nguyên tố: ");
            n = sc.nextInt();
        } while (n < 1);

        int n0 = n;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                top++;
                stack[top] = i;
                n /= i;
            }
        }
        System.out.printf("Số %d phân tích thành tích của các thừa số nguyên tố là ", n0);
        for (int i = top; i > 0; i--) {
            System.out.print(stack[i] + "*");
        }
        System.out.println(stack[0]);
        sc.close();
    }
}
