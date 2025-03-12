import java.util.*;
public class Cau39 {
    public static int hex2decimal(String s) {
        int sum = 0;
        int n = Integer.parseInt(s);
        for (int i = 0; i < s.length(); i++) {
            sum += (n % 10) * (int) Math.pow(2, i);
            n /= 10;
        }
        return sum;
    }

    public static String decimal2hex(int d) {
        if(d==0) return Integer.toString(0);
        String hex="0123456789ABCDEF";
        StringBuilder sb=new StringBuilder();
        while(d>0)
        {
            sb.append(hex.charAt(d%16));
            d/=16;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số hệ 2 để chuyển sang hệ 10: ");
        String he2=sc.nextLine();
        System.out.printf("Số %s chuyển sang hệ 10 là %d", he2, hex2decimal(he2));

        System.out.println("\n\nNhập vào số hệ 10 để chuyển sang hệ 16: ");
        int he10=sc.nextInt();
        System.out.printf("Số %d chuyển sang hệ 16 là %s", he10, decimal2hex(he10));
        sc.close();
    }
}
