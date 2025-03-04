import java.util.*;
/*Viết chương trình nhập vào các số nguyên (không lưu vào dãy),
đếm xem có bao nhiêu số nguyên dương và số nguyên âm đã được nhập;
tính và in ra màn hình tổng và giá trị trung bình của các số  được nhập,
không tính số 0. Chương trình kết thúc việc nhập khi gặp số 0.
Hiển thị giá trị trung bình dưới dạng số chấm động,
ví dụ: nếu nhập vào 1, 2, và 0 thì giá trị trung bình sẽ là 1.5.
*/
public class Cau8 {
    public static void main(String[] args) {
        int so=1;
        int countDuong=0, countAm=0;
        int sum=0;
        float avg=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhập vào các số cần tính, kết thúc khi nhập số 0:");
        while(so!=0)
        {
            so=sc.nextInt();
            if(so>0) countDuong++;
            else if(so<0) countAm++;
            sum+=so;
        }
        avg=(float)sum/(countAm+ countDuong);

        System.out.println("Số lượng số nguyên âm: " + countAm);
        System.out.println("Số lượng số nguyên dương: " + countDuong);
        System.out.println("Tổng các số là: "+sum);
        System.out.println("Giá trị trung bình các số là: " + avg);
    }
}
