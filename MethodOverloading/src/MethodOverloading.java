
public class MethodOverloading {

    public static void main(String[] args) {
        Adder a = new Adder();
        a.add(11, 11);
        a.add(10, 20, 30);
        System.out.println(a.add(11, 11));
        System.out.println(a.add(10, 20, 30));
        System.out.println(a.add(5.2, 3.7, 1.2));
    }

}

class Adder {

    int add(int a, int b) {
        return a + b;

    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

}
