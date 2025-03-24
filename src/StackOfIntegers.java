import java.util.Random;
import java.util.Scanner;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int n) {
        this.elements = new int[n];
        this.size=0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void peek() {
        if (!isEmpty()) System.out.print(elements[size - 1]);
        else System.out.println("Empty Stack!");
    }

    public void push(int value) {
        if (size >= elements.length) {
            // Nếu không đủ chỗ, mở rộng kích thước mảng
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = value; // Thêm giá trị và tăng kích thước
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty stack!");
        }
        int value=elements[size-1];
        elements[size-1]=0;
        size--;
        return value;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i <= 10; i++) {
            stack.push(i);
        }
        System.out.println("Elements in stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // In tất cả các phần tử trong stack
        }

        //Xử lý in ra thừa số nguyên tố
        System.out.println("\nEnter a positive integer: ");
        int n=sc.nextInt();
        for(int i=2; i<=n; i++)
        {
            while(n%i==0){
                stack.push(i);
                n/=i;
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // In tất cả các phần tử trong stack
        }
    }
}
