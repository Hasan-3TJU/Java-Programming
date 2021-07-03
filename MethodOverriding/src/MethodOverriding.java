
public class MethodOverriding {

    public static void main(String[] args) {
        One_Bank o = new One_Bank();
        SBAC s = new SBAC();
        Southeast se = new Southeast();

        System.out.println("One Bank Interest is = " + o.interest_rate() + "%");
        System.out.println("SBAC Interest is = " + s.interest_rate() + "%");
        System.out.println("Southeast Bank Interest is = " + se.interest_rate() + "%");
    }

}

class Bank {

    int interest_rate() {
        return 25;
    }
}

class One_Bank extends Bank {

    int interest_rate() {
        return 5;
    }
}

class SBAC extends Bank {

    int interest_rate() {
        return 8;
    }
}

class Southeast extends Bank {

    int interest_rate() {
        return 10;
    }
}
