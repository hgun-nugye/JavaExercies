import java.util.Scanner;

public class Cau29 {
    public static int average(int[] array){
        int sum=0;
        for(int i:array)
        {
            sum+=i;
        }
        return sum/ array.length;
    }
    public static double average(double[] array){
        double sum=0;
        for(double i:array)
        {
            sum+=i;
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng: ");
        int n=sc.nextInt();

        int[] arrayInt=new int[n];
        System.out.println("Nhập vào mảng số nguyên: ");
        for(int i=0; i<n; i++)
        {
           arrayInt[i]=sc.nextInt();
        }
        double[] arrayDouble=new double[n];
        System.out.println("Nhập vào mảng số thực: ");
        for(int i=0; i<n; i++)
        {
            arrayDouble[i]=sc.nextDouble();
        }

        System.out.println("TBC của mảng số nguyên là: "+ Cau29.average(arrayInt));
        System.out.println("TBC của mảng số thực là: "+ Cau29.average(arrayDouble));
        sc.close();
    }
}
