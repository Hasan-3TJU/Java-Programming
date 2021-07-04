
public class Abstraction {

    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
        b.gear_change();
    }

}

abstract class Bike {

    Bike() {
        System.out.println("Bike is Created");
    }

    abstract void run();

    void gear_change() {
        System.out.println("Gear Changes Smoothly");
    }
}

class Honda extends Bike {

    void run() {
        System.out.println("Run Safely");
    }

}
