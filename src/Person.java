import java.util.Date;

public abstract class Person {
    String name;
    String address;
    int phoneNum;
    String email;
    public abstract String toString();

}

class Student extends Person {
    public static final int freshman = 1;
    public static final int sophomore = 2;
    public static final int junior = 3;
    public static final int senior = 4;

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

class Employee extends Person {
    String job;
    double salary;
    Date dateWork;

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

class Faculty extends Employee {
    String workTime;
    String rankJob;

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

class Staff extends Employee {
    String job;

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

class myDate {
    int year;
    int month;
    int day;

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
class main
{
    public static void main(String[] args) {
        Person student=new Student();
        Person employee=new Employee();
        Person faculty=new Faculty();
        Person staff=new Staff();
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}


