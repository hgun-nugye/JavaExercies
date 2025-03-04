public class Cau4 {
    public static void main(String args[]) {
        int i = 5; // Khởi tạo biến nguyên thủy i với giá trị 5
        TangGiaTri inc = new TangGiaTri(); // Tạo một đối tượng của lớp TangGiaTri
        inc.tang(i); // Gọi phương thức tang và truyền i vào
        System.out.println("i = " + i); // In ra giá trị của i
    }
}

class TangGiaTri {
    public void tang(int i) {
        i = i - 2; // Giảm giá trị của i đi 2
        System.out.println("i = " + i); // In ra giá trị của i trong phương thức này
    }
    /*Trong phương thức này, biến i lại được gán giá trị là i - 2 (tức là 3).
    Giá trị này chỉ là tạm thời trong phạm vi của phương thức tang.
    Bởi vì i là kiểu dữ liệu nguyên thủy, khi truyền vào phương thức,
    một bản sao của giá trị được truyền, không phải tham chiếu đến biến gốc.
 */
}
