
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n == 0 || n == 1) {
            System.out.println(n + " is Not Prime Number");
        } else {
            int flag = 0;
            for (int i = 2; i < n-1; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is Not Prime Number");
            }
        }
    }

}
