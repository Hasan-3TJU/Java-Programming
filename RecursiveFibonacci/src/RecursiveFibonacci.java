
import java.util.Scanner;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        System.out.println(a + "\n" + b);
        fib(count - 2);

    }

    static int a = 0, b = 1, c = 0;

    static int fib(int count) {

        if (count > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            fib(count - 1);
        }
        return 0;

    }
}
