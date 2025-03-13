import java.util.Scanner;

public class Cau48 {
    public static void reverseDisplay(int value) {
        if (value == 0) System.out.println("Số 0 đảo ngược là 0");
        else {
            int newNum = 0;
            while (value / 10 != 0) {
                newNum += value % 10;
                newNum *= 10;
                value /= 10;
            }
            newNum += value;
            System.out.printf("Số %d đảo ngược là %d", value, newNum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số muốn đảo ngược: ");
        int n = sc.nextInt();
        reverseDisplay(n);
        sc.close();
    }
}
