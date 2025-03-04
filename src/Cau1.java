public class Cau1{
    private static int x = 20; //Biến x được khởi tạo với giá trị 20.

    public static void main(String[] args) {
         Cau1.x ++;//Dòng này tăng giá trị của x lên 1, do đó x bây giờ có giá trị 21.

        Cau1 obj1 = new Cau1();//Tạo đối tượng obj1 từ lớp Cau1.
        obj1.x --; //giảm giá trị của x xuống 1, vì x là biến tĩnh, tất cả các đối tượng đều tham chiếu đến cùng một biến.
        // Bây giờ x có giá trị 20.

        Cau1 obj2 = new Cau1();//Tạo đối tượng obj2.
        obj2.x --;//cũng giảm giá trị của x xuống 1. Bây giờ x có giá trị 19.

        obj1 = new Cau1();//Tạo một đối tượng mới obj1.
        obj1.x --;//lại giảm giá trị của x xuống 1. Bây giờ x có giá trị 18.
        System.out.println("x = " + x); //Cuối cùng, giá trị của x được in ra, và nó sẽ là 18.

        //Điều này xảy ra vì biến x là tĩnh,
        //nên mọi thay đổi đến nó từ bất kỳ đối tượng nào đều ảnh hưởng đến giá trị của nó trên toàn bộ lớp.
    }
}