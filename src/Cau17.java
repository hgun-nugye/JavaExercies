import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Cau17 {
    /* Viết chương trình chấm điểm tự động cho các sinh viên trên,
       hiển thị các sinh viên và số đáp án đúng theo thứ tự tăng dần của số đáp án đúng. */

    public static int ChamBai(String[] kq) {
        String[] answer = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        int dung = 0;

        for (int i = 0; i < kq.length; i++) {
            if (kq[i].equals(answer[i])) {
                dung++;
            }
        }
        return dung;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] dung = new int[8][2]; // To store index and correct answers

        String[][] kq = new String[8][10];
        System.out.println("Nhập vào đáp án các thí sinh: ");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Thí sinh thứ %d: ", i + 1);
            for (int j = 0; j < 10; j++) {
                kq[i][j] = sc.nextLine();
            }
            dung[i][0] = i; // Store contestant index
            dung[i][1] = ChamBai(kq[i]); // Store number of correct answers
        }

        // Sort the results based on the number of correct answers
        Arrays.sort(dung, Comparator.comparingInt(o -> o[1]));

        System.out.println("Danh sách số câu trả lời đúng của sinh viên đã được sắp sếp là: ");
        for (int[] ints : dung) {
            System.out.println("Thí sinh " + (ints[0] + 1) + ": " + ints[1] + " câu đúng");
        }

        sc.close(); // Close the scanner
    }
}