public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;

    public Fan() {
        speed = 1;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int Speed, boolean On, double Radius, String Color) {
        speed = Speed;
        on = On;
        radius = Radius;
        color = Color;
    }

    public String toString() {
        //Nếu quạt bật: trả về tốc độ, màu sắc, và bán kính dưới dạng một xâu kết hợp.
        if (on) {
            switch (speed) {
                case (SLOW):
                    System.out.println("Quạt đang ở mức Slow.");
                    break;
                case (MEDIUM):
                    System.out.println("Quạt đang ở mức Medium.");
                    break;
                case (FAST):
                    System.out.println("Quạt đang ở mức Fast.");
                    break;
            }
            return ("Quạt có màu " + color + " và bán kính mát là " + radius);
        } else {
            //Nếu chiếc quạt không được bật, trả về màu sắc và bán kính cùng với xâu “fan is off”
            return ("Quạt có màu " + color + " và bán kính mát là " + radius + "\nFan is " +
                    "off!");
        }
    }

    public static void main(String[] args) {
        Fan f1 = new Fan(3, true, 10, "yellow");
        Fan f2 = new Fan(2, false, 5, "white");

        //triệu gọi các đối tượng
        System.out.println("Quạt thứ nhất:"+ f1.toString());
        System.out.println("\nQuạt thứ hai:" +f2.toString());
    }

}
