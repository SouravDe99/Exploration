import java.util.Scanner;

public class Collatz_conjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c = 0;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
            c = c + 1;
            System.out.println(n);
        }
        System.out.println("Number of steps = " + c);
    }
}