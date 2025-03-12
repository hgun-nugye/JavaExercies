public class Cau38b {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui lòng nhập một xâu chứa các số nguyên.");
            return;
        }

        String input = args[0];
        String[] numbers = input.split(",");
        int sum = 0;

        for (String number : numbers) {
            try {
                sum += Integer.parseInt(number.trim());
            } catch (NumberFormatException e) {
                System.out.println(number + " không phải là một số nguyên hợp lệ.");
            }
        }

        System.out.println("Tổng các số nguyên: " + sum);
    }
}

