public class Cau2{
    public static void main (String[] args) {
        String s1 = "DHNT";
        /*s1 được khởi tạo với chuỗi "DHNT" bằng cách sử dụng cú pháp chuỗi trực tiếp.
        Trong Java, chuỗi này được lưu trữ trong string .*/

        String s2 = new String("DHNT");
        /*s2 được khởi tạo bằng cách sử dụng toán tử new,
        tạo ra một đối tượng String mới trong bộ nhớ heap,
        dù nội dung của nó là giống hệt với s1.*/

        if (s1 == s2)
            System.out.println("true");
        else
            System.out.println("false");
        /*Dòng s1 == s2 so sánh địa chỉ của hai đối tượng s1 và s2 trong bộ nhớ,
        không so sánh nội dung của chúng.
        Vì s1 và s2 không trỏ tới cùng một đối tượng
        (mặc dù nội dung của chúng là giống nhau), phép so sánh này sẽ trả về false. */

        //Trả về true
        if (s1.equals(s2))
            System.out.println("true");
        else
            System.out.println("false");

    }
}