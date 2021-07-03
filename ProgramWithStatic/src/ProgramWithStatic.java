
public class ProgramWithStatic {

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(101, "HASAN");
        Student s2 = new Student(102, "Sakib");
        s1.display();
        s2.display();
    }

}

class Student {

    int id;
    String name;
    static String dept = "LLB";

    Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    void display() {
        System.out.println("ID = " + id + " Name = " + name + " Department = " + dept);
    }

    static void change() {
        dept = "CSE";
    }
}
