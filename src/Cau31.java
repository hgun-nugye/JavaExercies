public class Cau31{
    Cau31(){
        System.out.print("Superclass");
        /*Đây là lớp cha (superclass) có một hàm khởi tạo (constructor) không tham số.
         Khi một đối tượng của lớp Cau31 được tạo ra, hàm khởi tạo sẽ in ra chuỗi "Superclass".*/
    }

    public static void main (String args[]){
        new Cau32();
        /*Phương thức main là điểm khởi đầu của chương trình.
        Trong phương thức này, một đối tượng của lớp Cau32 được
         tạo ra.*/
    }

}
class Cau32 extends Cau31{
    Cau32(){
        System.out.print(" Subclass");
        /*Khi tạo một đối tượng của lớp con (Cau32),
        hàm khởi tạo của lớp cha (Cau31) sẽ tự động được gọi trước,
        dẫn đến việc in ra thông điệp từ cả hai lớp.*/
    }
}