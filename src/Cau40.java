import java.util.Arrays;
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
        out.println("\nDanh sách đã sắp xếp là: ");
        for(int i:list)
        {
            out.print(i+" ");
        }
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
        out.print("Nhập vào kích thước danh sách: ");
        int n = sc.nextInt();
        int[] list = new int[n];
        out.println("Nhập vào danh sách các số: ");
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        int[] sortedList = Arrays.copyOf(list, list.length); // Tạo bản sao để tìm kiếm nhị phân

        out.println("Nhập vào số cần tìm: ");
        int num = sc.nextInt();
        out.println("Dùng linear search: ");
        if (linearSearch(list, num) != -1)
            out.printf("Tìm thấy số %d ở vị trí %d", num, linearSearch(sortedList, num));
        else out.printf("Không tìm thấy số %d", num);

        out.println("\n\nDùng binay search: ");
        int bisearch=binarySearch(list, num);
        if (bisearch != -1)
            out.printf("\nTìm thấy số %d ở vị trí %d", num, bisearch);
        else out.printf("Không tìm thấy số %d", num);

        sc.close();
    }
}
