
import java.util.Scanner;

public class ThisKeywordJava {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Hasan", "CSE", "12th");
        Student s2 = new Student(102, "Sakib", "CSE", "12th");
        s1.display();
        s2.display();

    }

}

class Student {

    Scanner s = new Scanner(System.in);
    int id;
    String name;
    String dept;
    String sem;

    Student(int id, String name, String dept, String sem) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sem = sem;
    }

    void display() {
        System.out.println("ID = " + id + " Name = " + name + " Department = " + dept + " Semester = " + sem);
    }

}
