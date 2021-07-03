
public class Methodoverriding1 {

    public static void main(String[] args) {
        Pulser p = new Pulser();
        p.run();
        Honda h = new Honda();
        h.run();
    }

}

class Bike {

    void run() {
        System.out.println("110 Mileage Running");
    }
}

class Pulser extends Bike {

    void run() {
        System.out.println("80 Mileage Running");
    }
}

class Honda extends Bike {

}
