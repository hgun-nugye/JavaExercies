package RationalNumber;

public class RationalTester {
    public static void main(String[] args) {
        RationalNumber n1 = new RationalNumber(6, 8);
        RationalNumber n2 = new RationalNumber(1, 3);
        RationalNumber n1o = new RationalNumber(n1);
        RationalNumber n2o = new RationalNumber(n2);

        System.out.print("First rational number: " + n1.toString());
        System.out.print("\nSecond rational number: " + n2.toString());


        //kiểm tra equals
        if (n1.equals(n2))
            System.out.println("\nFirst rational number is equals Second rational number");
        else
            System.out.println("\nFirst rational number is not equals Second rational number");

        // nghịch đảo
        System.out.print("First reciprocal rational number: " + n1.reciprocal().toString());
        System.out.print("\nSecond reciprocal rational number: " + n2.reciprocal().toString());

        //trả lại số đã nhập để tính toán
        n1 = new RationalNumber(n1o);
        n2 = new RationalNumber(n2o);

        //cộng hai số
        System.out.printf("\n%s + %s = %s", n1.toString(), n2.toString(), n1.add(n2).toString());

        //trừ hai số
        System.out.printf("\n%s - %s = %s", n1.toString(), n2.toString(),
                n1.subtract(n2).toString());


        //nhân hai số
        System.out.printf("\n%s * %s = %s", n1.toString(), n2.toString(),
                n1.multiply(n2).toString());


        //chia hai số
        System.out.printf("\n%s : %s = %s", n1o.toString(), n2o.toString(),
                n1.divide(n2).toString());

    }
}
