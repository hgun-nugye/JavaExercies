//import java.util.Scanner;

public class Cau35 {
    public static String sort(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[i];
                    charArray[i] = temp;
                }
            }
        }
        return new String(charArray);
    }

    public static boolean isAnagram(String s1, String s2) {
        String sorted1 = sort(s1);
        String sorted2 = sort(s2);

        return (sorted1.length() == sorted2.length() && sorted1.equals(sorted2));
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
        System.out.println(isAnagram("garden", "ranged"));
        System.out.println(isAnagram("split", "lips"));

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần sắp xếp: ");
        String str1 = sc.nextLine();
        System.out.println("Chuỗi sau khi sắp xếp là: " + sort(str1));

        System.out.println("Nhập vào chuỗi cần so sánh anagram: ");
        String str2 = sc.nextLine();
        if (isAnagram(str1, str2))
            System.out.println("Đây là 2 chuỗi anagram!");
        else
            System.out.println("Đây không phải 2 chuỗi anagram!");
        sc.close();*/
    }
}
