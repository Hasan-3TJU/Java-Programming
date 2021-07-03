
public class StaticVsNonStatic {

    public static void main(String[] args) {
        Bike.change();
        Bike b = new Bike(65, 760, "Honda", 12);
        b.display();
    }

}

class Bike {

    static String name = "Honda X-Blade";
    int mileage;
    int hp;
    String Company;

    int fuelcap;

    Bike(int mileage, int hp, String Company, int fuelcap) {
        this.mileage = mileage;
        this.hp = hp;
        this.Company = Company;

        this.fuelcap = fuelcap;
    }

    void display() {
        System.out.println("Bike Name = " + name + " Mileage = " + mileage + " Horse Power = " + hp + " Company = " + Company + " Fuel Cap = " + fuelcap);
    }

    static void change() {

        name = "Suzuki Gixer";
    }

}
