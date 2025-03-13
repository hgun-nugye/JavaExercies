import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Cau40 {
    public static int linearSearch(int[] list, int key) {
        int find = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key)
                return i;
        }
        return find;
    }

    public static int binarySearch(int[] list, int key) {
        Arrays.sort(list);

        int left = 0, right = list.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (list[mid] == key) {
                return mid;
            }
            if (list[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Random rd = new Random();
        int[] list = new int[100000];

        //tạo danh sách số ngẫu nhiên
        for(int i=0; i<100000; i++)
        {
            list[i]=rd.nextInt();
        }
        int[] sortedList = Arrays.copyOf(list, list.length); // Tạo bản sao để tìm kiếm nhị phân

        //tạo số ngẫu nhiên cho tìm kiếm
        int linum = rd.nextInt();

        //linearSearch
        out.println("Dùng linear search: ");
        long be=System.currentTimeMillis();
        int lisearch=linearSearch(list, linum);
        if (lisearch!= -1)
            out.printf("Tìm thấy số %d ở vị trí %d", linum, lisearch);
        else out.printf("Không tìm thấy số %d trong dãy", linum);
        long af=System.currentTimeMillis();
        out.println("\nLinearSearch thực hiện trong " +(af-be) +" ms");

        int binum = rd.nextInt();
        //binarySearch
        out.println("\n\nDùng binay search: ");
        be=System.currentTimeMillis();
        int bisearch = binarySearch(sortedList, binum);
        if (bisearch != -1)
            out.printf("\nTìm thấy số %d ở vị trí %d", binum, bisearch);
        else out.printf("Không tìm thấy số %d trong dãy", binum);
        af=System.currentTimeMillis();
        out.println("\nBinarySearch thực hiện trong " +(af-be) +" ms");

        sc.close();
    }
}
