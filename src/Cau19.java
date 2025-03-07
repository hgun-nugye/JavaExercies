import java.util.Scanner;

public class Cau19 {
    public static int sumDigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số cần tính: ");
        int n=sc.nextInt();
        System.out.printf("Tổng các chữ số của số %d là %d", n, sumDigits(n));
        sc.close();
    }
}
