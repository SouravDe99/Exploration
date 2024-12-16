import java.util.Scanner;

public class Matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Enter order of first matrix: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Enter order of second matrix: ");
        c = sc.nextInt();
        d = sc.nextInt();
        if (b == c) {
            int i, j, k;
            double[][] x = new double[a][b];
            double[][] y = new double[c][d];
            double[][] z = new double[a][d];
            System.out.println("Enter first matrix: ");
            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    x[i][j] = sc.nextDouble();
                }
            }
            System.out.println("Enter second matrix: ");
            for (i = 0; i < c; i++) {
                for (j = 0; j < d; j++) {
                    y[i][j] = sc.nextDouble();
                }
            }
            for (i = 0; i < a; i++) {
                for (j = 0; j < d; j++) {
                    for (k = 0; k < b; k++) {
                        z[i][j] = z[i][j] + x[i][k] * y[k][j];
                    }
                }
            }
            System.out.println("Resultant matrix: ");
            for (i = 0; i < a; i++) {
                for (j = 0; j < d; j++) {
                    System.out.print(z[i][j] + " ");
                }
                System.out.println();
            }
        } else
            System.out.println("These matrix orders are not compatible");
    }
}