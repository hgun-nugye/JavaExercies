import java.util.Scanner;

public class Cau26 {
    public static int uscln(int m, int n)
    {
        while(n!=0)
        {
            int temp=n;
            n=m%n;
            m=temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 2 số a và b để tìm ước chung lớn nhất: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.printf("Ước chung lớn nhất của %d và %d là %d", a,b,uscln(a,b));
        System.out.printf("\nBội chung nhỏ nhất của %d và %d là %d", a,b,a*b/uscln(a,b));
        sc.close();
    }
}
