
import java.util.Scanner;

public class ClonnigArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b[] = new int[n];

        for (int i = 0; i < b.length; i++) {
            b[i] = s.nextInt();
        }
        System.out.println("Print original Array");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        int a[] = b.clone();
        System.out.println("\nPrint Clonning Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
