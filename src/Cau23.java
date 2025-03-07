import java.util.Scanner;

public class Cau23 {
    public static int reverse(int number)
    {
        int num=0;
        while(number/10!=0)
        {
            num+=number%10;
            number/=10;
            num*=10;
        }
        return num+number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số cần đảo ngược: ");
        int n=sc.nextInt();
        int n0=n;
        System.out.printf("Số %d sau khi được đảo ngược là %d", n0, reverse(n));
        sc.close();
    }
}
