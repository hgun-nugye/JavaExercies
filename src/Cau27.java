import java.util.Scanner;

public class Cau27 {
    public static int parseBinary(String binaryString)
    {
        int bina=Integer.parseInt(binaryString);
        int dec=0;
        int i=0;
        while(bina!=0)
        {
            dec+= (int) ((bina%10)*Math.pow(2,i));
            i++;
            bina/=10;
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hệ 2 cần chuyển sang hệ 10:");
        String str=sc.nextLine();
        System.out.printf("%s (hệ 2) = %d (hệ 10)", str, parseBinary(str));
    }
}
