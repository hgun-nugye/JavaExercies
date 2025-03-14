import java.util.*;

public class Cau8 {
    public static void main(String[] args) {
        int so = 1;
        int countDuong = 0, countAm = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào các số cần tính, kết thúc khi nhập số 0:");
        while (so != 0) {
            so = sc.nextInt();
            if (so > 0) countDuong++;
            else if (so < 0) countAm++;
            sum += so;
        }
        float avg = (float) sum / (countAm + countDuong);

        System.out.println("Số lượng số nguyên âm: " + countAm);
        System.out.println("Số lượng số nguyên dương: " + countDuong);
        System.out.println("Tổng các số là: " + sum);
        System.out.println("Giá trị trung bình các số là: " + avg);
    }
}
