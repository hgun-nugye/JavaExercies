/*Xây dựng hai phương thức đảo ngược một dãy số nguyên theo hai cách khác nhau:
copy dãy đó vào một dãy mới và đảo ngược dãy nhưng không tạo ra dãy mới.
Viết đoạn chương trình để test các phương thức vừa tạo.*/
import java.util.*;
public class Cau12 {

    public static int[] DayMoiDaoNguoc(int[] day1, int[] day2)
    {
        int length=day1.length-1;
        for(int i=0; i<day1.length; i++)
        {
            day2[length]=day1[i];
            length--;
        }
        return day2;
    }
    public static int[] DayDaoNguoc(int[] day)
    {
        int left=0, right=day.length-1;
        while(left!=right)
        {
            int temp=day[left];
            day[left]=day[right];
            day[right]=temp;
            left++;
            right--;
        }
        return day;
    }

    public static void In(int[] day)
    {
        for(int i=0; i< day.length; i++)
        {
            System.out.print(day[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int n=sc.nextInt();
        int[] day1= new int[n];
        int[] day2= new int[n];

        //nhập vào các phần tử
        for(int i=0; i<n; i++)
        {
            day1[i]=sc.nextInt();
        }

        System.out.println("Dãy được đảo ngược bằng cách tạo dãy mới:");
        In(DayMoiDaoNguoc(day1, day2));
        System.out.println();
        System.out.println("Dãy được đảo ngược nhưng không tạo dãy mới:");
        In(DayDaoNguoc(day1));
    }
}
