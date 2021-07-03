
public class SyperKeyword1 {

    public static void main(String[] args) {
        Employee.change();
        Employee e = new Employee(101, "Hasan", 25500, "Dahaka");
        e.display();
    }

}

class Person {

    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person {

    static double salary;
    static String location;

    Employee(int id, String name, double salary, String location) {
        super(id, name);

    }

    void display() {
        System.out.println("ID = " + id + " Name = " + name + " Salary = " + salary + " Location = " + location);
    }

    static void change() {
        salary = 30500.65;
        location = "Sylhet";
    }
}
