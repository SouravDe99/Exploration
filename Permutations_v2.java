import java.util.Scanner;

public class Permutations_v2 {

    public static void Permute(int[] a, int x, int d) {
        if (x == 1) {
            display(a, d);
            return;
        }
        int i, t;
        for (i = 0; i < x; i++) {
            Permute(a, x - 1, d);
            if (i == x - 1)
                continue;
            if (x % 2 == 1) {
                t = a[0];
                a[0] = a[x - 1];
            } else {
                t = a[i];
                a[i] = a[x - 1];
            }
            a[x - 1] = t;
        }
    }

    public static void display(int[] a, int d) {
        int i, s = 0;
        for (i = 0; i < d; i++) {
            s = s * 10 + a[i];
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, d;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        d = ("" + n + "").length();
        int[] a = new int[d];
        for (i = 0; i < d; i++) {
            a[i] = n % 10;
            n = n / 10;
        }
        Permute(a, d, d);
    }
}
