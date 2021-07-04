
public class Interface2 {

    public static void main(String[] args) {
        Mileage m = new Bike();
        System.out.println("The Mileage of the Bike is " + m.mile() + " kmph");
        Gear_Change g = new Bike();
        System.out.println("The Gear number of the Bike is " + g.g_c());
    }

}

interface Mileage {

    int mile();
}

interface Gear_Change {

    int g_c();
}

class Bike implements Mileage, Gear_Change {

    @Override
    public int mile() {
        return 60;
    }

    @Override
    public int g_c() {
        return 5;
    }

}
