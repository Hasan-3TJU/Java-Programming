
import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        //Addition of Matrix
        int a[][] = {{1, 2, 3}, {4, 5, 6}};
        int b[][] = {{1, 2, 3}, {4, 5, 6}};
        int c[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Rows of 1st Matrix");
        int n = s.nextInt();
        System.out.println("Enter the Number of Column of 1st matrix");
        int m = s.nextInt();

        int m1[][] = new int[n][m];
        System.out.println("Enter the data of 1st Matrix");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                m1[i][j] = s.nextInt();
            }
        }

        System.out.println("1st Matrix are");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the Number of Rows of 2nd Matrix");
        int n_1 = s.nextInt();
        System.out.println("Enter the Number of Column of 2nd matrix");
        int m_1 = s.nextInt();

        if (m != n_1) {
            System.out.println("Multiplied can't be possible");
        } else {
            int m2[][] = new int[n_1][m_1];
            int[][] f_m = new int[n][m_1];
            System.out.println("Enter the data of 2nd Matrix");

            for (int i = 0; i < n_1; i++) {
                for (int j = 0; j < m_1; j++) {
                    m2[i][j] = s.nextInt();
                }
            }

            System.out.println("2nd Matrix are");
            for (int i = 0; i < n_1; i++) {
                for (int j = 0; j < m_1; j++) {
                    System.out.print(m2[i][j] + " ");
                }
                System.out.println();
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m_1; j++) {
                    for (int k = 0; k < n_1; k++) {
                        sum += m1[i][k] * m2[k][j];
                    }
                    f_m[i][j] = sum;
                }

            }

            System.out.println("The Matrix Result is = ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m_1; j++) {
                    System.out.print(f_m[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
