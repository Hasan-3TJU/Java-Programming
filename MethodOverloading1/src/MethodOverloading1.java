
public class MethodOverloading1 {

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(5 * 7);
        System.out.println(5 * 7 * 10);
        System.out.println(7.2 * 8.5 * 2.3);
    }

}

class Product {

    int mul(int a, int b) {

        return a * b;
    }

    int mul(int a, int b, int c) {
        return a * b * c;
    }

    double mul(double a, double b, double c) {
        return a * b * c;
    }
}
