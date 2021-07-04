
public class Interface3 {

    public static void main(String[] args) {
        char_model1 cm1;
        cm1 = new Bike();
        System.out.println("The Fuel Capacity of the Bike is " + cm1.fuel_cap() + " Liter");
        char_model2 cm2;
        cm2 = new Bike();
        System.out.println("The Brake is " + cm2.brake());
        char_model3 cm3;
        cm3 = new Bike();
        System.out.println("The Gear no. of BIKE is " + cm3.gear_no());
    }

}

interface char_model1 {

    int fuel_cap();

}

interface char_model2 {

    String brake();
}

interface char_model3 {

    int gear_no();
}

class Bike implements char_model1, char_model2, char_model3 {

    @Override
    public int fuel_cap() {
        return 14;
    }

    @Override
    public String brake() {
        return "Hydrolic Brake";

    }

    @Override
    public int gear_no() {
        return 5;
    }

}
