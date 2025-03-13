import java.util.Scanner;

public class Cau45 {
    public static double m(int i) {
        double s;
        if (i == 0) return 0;
        else {
            s = (double) i / (i + 1);
        }
        return s + m(i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Tổng m của i = %d là: %f\n", i, m(i));
        }
        sc.close();
    }
}
