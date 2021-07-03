
import java.util.Scanner;

public class ArrayMinimum {

    public static void main(String[] args) {

        Array a = new Array();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b[] = new int[n];

        for (int i = 0; i < b.length; i++) {
            b[i] = s.nextInt();
        }
        a.min(b);
    }

}

class Array {

    int min(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }

        }
        System.out.println("The Minimum Value is " + min);
        return 0;
    }
}
