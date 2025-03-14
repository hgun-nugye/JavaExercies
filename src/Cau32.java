import java.util.Scanner;

public class Cau32 {
    public static String convertMillis(long timeMillis) {
        long hour = (timeMillis / 3600000);
        long minute = (timeMillis / 60000) % 60;
        long second = (timeMillis / 1000) % 60;

        // Format to ensure two digits
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số mili giây: ");
        long timeMillis = sc.nextLong();
        System.out.println("Đây là thời gian được đổi: " + Cau32.convertMillis(timeMillis));
        sc.close();
    }
}
