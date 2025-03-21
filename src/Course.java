import java.util.Arrays;

public class Course {
    public String name;
    public String[] students;
    public int numberOfStudents;

    public Course(String name) {
        this.name = name;
        this.students = new String[100];
        this.numberOfStudents = 0;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(String nameStudent) {
        if(numberOfStudents<students.length){
            this.students[numberOfStudents] = nameStudent;
            numberOfStudents++;
        }
        else System.out.println("So luong sinh vien da day!");

    }

    public void getStudent() {
        String[] currentStudents=Arrays.copyOf(students, numberOfStudents);
        System.out.println("Students: " + Arrays.toString(currentStudents));
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {
        Course c1 = new Course("English");
        Course c2 = new Course("Mathematics");
        c1.addStudent("Hong Hanh");
        c1.addStudent("An Khang");
        c2.addStudent("Truc Linh");
        c2.addStudent("Truc Anh");
        c2.addStudent("Dam Linh");
        System.out.printf("So luong sinh vien cua khoa hoc %s la: %d", c1.name, c1.getNumberOfStudents());
        System.out.println("\nDanh sach sinh vien cua khoa hoc la: ");
        c1.getStudent();

        System.out.printf("\nSo luong sinh vien cua khoa hoc %s la: %d", c2.name,
                c2.getNumberOfStudents());
        System.out.println("\nDanh sach sinh vien cua khoa hoc la: ");
        c2.getStudent();

    }


}
