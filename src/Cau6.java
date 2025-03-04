import java.util.*;

/*Viết chương trình cho phép nhập ba số nguyên từ bàn phím và lưu vào ba biến tương ứng là num1, num2, num3.
Chương trình sẽ sắp xếp ba số đó theo thứ tự num1 <=  num2 <= num3 và xuất kết quả ra màn hình.*/
public class Cau6 {
    public static void TangDan(int num1, int num2, int num3) {
        System.out.println("\nĐây là các số đã được sắp xếp tăng dần: ");

        //xét num1 so với 2 số còn lại
        if (num1 < Math.min(num2, num3)) {
            System.out.print(num1 + " " + Math.min(num2, num3) + Math.max(num2, num3));
            //khi này num 1 là min

        }
        else //nếu num1 không phải min thì xét 2 số còn lại
        {
            System.out.print(Math.min(num2, num3) + " ");//xuất ra min của 2 số còn lại
            if (num1 < Math.max(num2, num3)) //xét num1 với số không phải min
            {
                //num1 không phải max
                System.out.println(num1 + " " + Math.max(num2, num3));

            } else System.out.println(Math.max(num2, num3) + " " + num1);//num1 là max
        }
    }

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào các số thứ 1, 2, 3: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.printf("\nĐây là các số vừa nhập: %d %d %d", num1, num2, num3);

        TangDan(num1, num2, num3);
    }
}
