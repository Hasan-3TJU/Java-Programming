
import java.util.Scanner;

public class JavaOperations {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char operator;
        int a = s.nextInt();
        int b = s.nextInt();
        int res = 0;
        System.out.println("Choose an operator: +, -, *, /, %, &, ^, |, >, <");
        operator = s.next().charAt(0);

        switch (operator) {
            case '+':
                res = a + b;
                System.out.println("Sum is " + res);
                break;
            case '-':
                res = a - b;
                System.out.println("Sub is " + res);

            case '*':
                res = a * b;
                System.out.println("Product is " + res);
                break;
            case '/':
                res = a / b;
                System.out.println("Quiotient is " + res);
                break;
            case '%':
                res = a % b;
                System.out.println("Remainder is " + res);
                break;
            case '>':
                res = a >> 2;
                System.out.println("Right Shift is " + a);
                break;
            case '<':
                res = a << 2;
                System.out.println("Left Shift is " + a);
                break;
            case '&':
                res = a & b;
                System.out.println("Bitwose and is " + res);
                break;
            case '^':
                res = a ^ b;
                System.out.println("Bitwose exclusive or is " + res);
                break;
            case '|':
                res = a | b;
                System.out.println("Bitwose Inclusive or is " + res);
                break;
        }

        System.out.println("Please Input a valid Number for Unary Operation");

        //Unary Operator
        int c = s.nextInt();//5

        System.out.println(c++);//5

        System.out.println(++c);//7

        System.out.println(c--);//7

        System.out.println(--c);//5

        //Relational Operaotr
        System.out.println("Relational Operation Check");
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is smaller than " + b);
        } else {
            System.out.println(a + " is equal of " + b);
        }

        //Logical Operator
        if (a > b || a == b) {
            if (a == b) {
                System.out.println("a is equal to b");
            } else {
                System.out.println("a is greater than b");
            }
        } else {
            System.out.println("a is less than b");
        }

        //Ternary Opertor
        System.out.println("Ternary Operation/nInput a number for checking it is even or odd");
        int n = s.nextInt();
        String output = (n % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(n + " is " + output);
    }

}
