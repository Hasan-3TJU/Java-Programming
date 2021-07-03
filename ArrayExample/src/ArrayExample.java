
import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        //simple declaration of Array
        int a[] = {5, 6, 7};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b[] = new int[n];

        for (int i = 0; i < b.length; i++) {
            b[i] = s.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

}
