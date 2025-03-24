import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Cau7_PhoneBookHashTable {
    private final Hashtable<String, Integer> phoneBook = new Hashtable<>();

    public void addPhone(String name, int num) {
        phoneBook.put(name, num);
    }

    public boolean searchPhone(String name) {
        return phoneBook.containsKey(name);
    }

    public void changeNumPhone(String name, int num) {
        if (searchPhone(name)) {
            phoneBook.put(name, num);
        } else System.out.println("Not found!");
    }

    public void deletePhone(String name) {
        if (searchPhone(name)) {
            phoneBook.remove(name);
            System.out.println("Deleted!");
        } else System.out.println("Not found!");
    }

    public void showPhone(String name) {
        if (searchPhone(name)) {
            int num = phoneBook.get(name);
            System.out.println("Name: " + name + "\tNum: " + num);
        } else System.out.println("Not found!");

    }

    public void showAllPhones() {
        if (phoneBook.isEmpty()) {
            System.out.println("Phonebook is empty.");
            return;
        }
        System.out.println("Phonebook:");
        for (Map.Entry<String, Integer> pb : phoneBook.entrySet()) {
            System.out.println("Name: " + pb.getKey() + "\tNum: " + pb.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cau7_PhoneBookHashTable phoneBook = new Cau7_PhoneBookHashTable();
        int click = -1;

        String message = """
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