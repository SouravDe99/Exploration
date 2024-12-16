import java.util.Scanner;

public class Permutations_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s = 0, d, f = 1, i, j, x = 0, y = 0, t;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        d = ("" + n + "").length();
        int[] a = new int[d];
        for (i = 1; i <= d; i++) {
            f = f * i;
        }
        for (i = 0; i < d; i++) {
            a[i] = n % 10;
            n = n / 10;
        }
        for (i = 0; i < (d - 1); i++) {
            for (j = 0; j < (d - i - 1); j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.println("The permutations of this number are:");
        for (i = 1; i <= f; i++) {
            for (j = 0; j < d; j++) {
                s = s * 10 + a[j];
            }
            System.out.println(s);
            s = 0;
            for (j = 0; j < (d - 1); j++) {
                if (a[j] < a[j + 1])
                    x = j;
            }
            for (j = 0; j < d; j++) {
                if (a[x] < a[j])
                    y = j;
            }
            t = a[x];
            a[x] = a[y];
            a[y] = t;
            for (j = 1; j <= ((d - x - 1) / 2); j++) {
                t = a[x + j];
                a[x + j] = a[d - j];
                a[d - j] = t;
            }
        }
    }
}
