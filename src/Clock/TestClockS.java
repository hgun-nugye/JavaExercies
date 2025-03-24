package Clock;

import java.time.LocalTime;
import java.util.Random;

public class TestClockS {
    public static void main(String[] args) {
        Random rd = new Random();
        LocalTime localTime=LocalTime.now();
        ClockS time = new ClockS();
        time.setTime(localTime.getHour(), localTime.getMinute(), localTime.getSecond());
        System.out.println("Thoi gian da nhap la: "+ time.getTime());
        System.out.println("Tong so giay la: " + time.totalSeconds());

        time.addSeconds(rd.nextInt(3601));
        System.out.println("Tong so giay moi la: " + time.totalSeconds());
        System.out.println("Thoi gian moi la: " + time.getTime());
    }
}
