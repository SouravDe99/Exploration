import java.util.Scanner;

public class Goldbach_conjecture {

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
        int n, i, r = 0;
        System.out.println("Enter an even number greater than 2:");
        n = sc.nextInt();
        if ((n % 2 == 0) && (n > 2)) {
            for (i = 1; i <= (n / 2); i++) {
                if ((Prime(i)) && (Prime(n - i))) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    r = r + 1;
                }
            }
            System.out.println("Number of prime sum representations of " + n + " = " + r);
        } else
            System.out.println("Wrong input");
    }
}   