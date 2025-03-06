import java.util.Scanner;
import java.util.Vector;

public class Cau7_PhoneBookVector {
    private Vector<String> names;
    private Vector<Integer> nums;

    public Cau7_PhoneBookVector() {
        names = new Vector<>();
        nums = new Vector<>();
    }

    public void addPhone(String name, int num) {
        names.add(name);
        nums.add(num);
    }

    public boolean searchPhone(String name) {
        return names.contains(name);
    }

    public int findIndex(String name) {
        return names.indexOf(name);
    }

    public void changeNumPhone(String name, int num) {
        int index = findIndex(name);
        if (index != -1) {
            nums.set(index, num);
        } else {
            System.out.println("Not found!");
        }
    }

    public void deletePhone(String name) {
        int index = findIndex(name);
        if (index != -1) {
            names.remove(index);
            nums.remove(index);
            System.out.println("Deleted " + name);
        } else {
            System.out.println("Not found!");
        }
    }

    public void showPhone(String name) {
        int index = findIndex(name);
        if (index != -1) {
            System.out.printf("Name: %s\tNum: %d\n", names.get(index), nums.get(index));
        } else {
            System.out.println("Not found!");
        }
    }

    public void showAllPhones() {
        System.out.println("Phonebook:");
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("Name: %s\tNum: %d\n", names.get(i), nums.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cau7_PhoneBookVector phoneBook = new Cau7_PhoneBookVector();
        int click = -1;

        String message= """
                Click 1 to add a new phone
                Click 2 to find a phone
                Click 3 to change a number
                Click 4 to delete a phone
                Click 5 to show phonebook
                Click 0 to end
                """;
        System.out.println(message);

        while (click != 0) {
            System.out.println("Enter your choice: ");
            click = sc.nextInt();
            sc.nextLine(); // Clear the newline character

            switch (click) {
                case 1: {
                    System.out.println("Enter the phone number: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name: ");
                    String name = sc.nextLine();
                    phoneBook.addPhone(name, num);
                    break;
                }
                case 2: {
                    System.out.println("Enter the name to find: ");
                    String name = sc.nextLine();
                    if (phoneBook.searchPhone(name)) {
                        phoneBook.showPhone(name);
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter the name to change the number: ");
                    String name = sc.nextLine();
                    if (phoneBook.searchPhone(name)) {
                        System.out.println("Enter the new number: ");
                        int num = sc.nextInt();
                        phoneBook.changeNumPhone(name, num);
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter the name to delete: ");
                    String name = sc.nextLine();
                    phoneBook.deletePhone(name);
                    break;
                }
                case 5: {
                    phoneBook.showAllPhones();
                    break;
                }
                case 0: {
                    System.out.println("End!");
                    break;
                }
                default: {
                    System.out.println("Error! Please enter a valid option.");
                }
            }
        }
        sc.close();
    }
}