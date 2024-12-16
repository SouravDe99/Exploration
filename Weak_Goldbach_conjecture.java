import java.util.Scanner;

public class Weak_Goldbach_conjecture {

    public static boolean Prime(int n) {
        int i, c = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                c = c + 1;
        }
        return c == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, r = 0;
        System.out.println("Enter an odd number greater than 5:");
        n = sc.nextInt();
        if ((n % 2 == 1) && (n > 5)) {
            for (i = 1; i <= (n / 2); i++) {
                for (j = i; j <= ((n - i) / 2); j++) {
                    if ((Prime(i)) && (Prime(j)) && (Prime(n - i - j))) {
                        System.out.println(n + " = " + i + " + " + j + " + " + (n - i - j));
                        r = r + 1;
                    }
                }
            }
            System.out.println("Number of prime sum representations of " + n + " = " + r);
        } else
            System.out.println("Wrong input");
    }
}