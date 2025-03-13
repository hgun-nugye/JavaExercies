import java.util.Scanner;

public class Cau44 {
    public static String GetLetter(String str) {
        int j = 0;

        //lấy độ dài chuỗi chỉ chứa ký tự chữ cái
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter((str.charAt(i))))
                j++;
        }
        //khởi tạo mảng ký tự với độ dài j vừa tìm
        char[] ch = new char[j];

        j = -1;
        //lọc các kí tự không phải chữ cái
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                ch[++j] = str.charAt(i);
            }
        }
        return new String(ch, 0, j + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một xâu: ");
        String str = sc.nextLine();

        String[] lstr = str.split(" ");

        //Lấy chữ cái trong từng từ vừa split
        int i = 0;
        for (String s : lstr) {
            lstr[i++] = GetLetter(s);
        }

        //in các từ đúng (chỉ chứa chữ cái)
        for (String s : lstr) {
            System.out.println(s);
        }

        sc.close();
    }
}
