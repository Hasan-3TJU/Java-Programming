
import java.util.Scanner;

public class ShieveOfErathosthenes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        boolean b[] = new boolean[n];

        for (int i = 0; i < b.length; i++) {
            b[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (b[i] == true) {
                for (int j = i * i; j < n; j += i) {
                    b[j] = false;

                }
            }
        }
        
        for(int i=2;i<b.length;i++){
            if(b[i]==true){
                System.out.println(i+" is a prime number");
            }
        }

    }
}
