import java.util.*;

public class Cau11 {
    public static boolean SNT(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int n = 0;

        List<Integer> dsSNT = new ArrayList<>();
        while (count < 1000) {
            if (SNT(n)) {
                count++;
                dsSNT.add(n);
            }
            n++;
        }

        System.out.println("1000 số nguyên tố đầu tiên là:");
        for (int i = 1; i <= dsSNT.size(); i++) {
            System.out.print(dsSNT.get(i - 1) + " ");
            if (i % 10 == 0) System.out.println();
        }
    }
}
