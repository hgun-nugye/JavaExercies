public class Cau38a {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println(arg + " không phải là một số nguyên hợp lệ.");
            }
        }
        System.out.println("Tổng các số nguyên: " + sum);
    }
}

