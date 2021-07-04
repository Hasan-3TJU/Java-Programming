
public class Interface {

    public static void main(String[] args) {
        Bank b;
        b = new One_Bank();
        System.out.println("The Interest of Onebank is " + b.get_of_interest() + "%");
        b = new SBAC();
        System.out.println("The Interest of SBAC is " + b.get_of_interest() + "%");
    }

}

interface Bank {

    int get_of_interest();
}

class One_Bank implements Bank {

    @Override
    public int get_of_interest() {
        return 7;
    }

}

class SBAC implements Bank {

    @Override
    public int get_of_interest() {
        return 10;
    }

}
