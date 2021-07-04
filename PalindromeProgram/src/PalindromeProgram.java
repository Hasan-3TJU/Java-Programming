
import java.util.Scanner;

public class PalindromeProgram {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String s1 = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.reverse();
        String s2 = sb.toString();
        System.out.println(s1 + " " + s2);

        if (s1.equals(s2)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("Not");
        }

    }

}
