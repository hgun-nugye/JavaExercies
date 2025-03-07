import java.util.Scanner;

public class Cau20 {
    public static int count(String str, char a)
    {
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==a)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào câu: ");
        String str=sc.nextLine();
        System.out.println("Nhập vào kí tự cần tìm: ");
        String ch=sc.nextLine();
        char c=ch.charAt(0);

        System.out.printf("Ký tự %c xuất hiện %d lần trong câu %s", c, count(str,c),str);
        sc.close();
    }
}
