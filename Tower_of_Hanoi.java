import java.util.Scanner;

public class Tower_of_Hanoi {
    public static void Hanoi(int n, char from, char via, char to) {
        if (n > 0) {
            Hanoi(n - 1, from, to, via);
            System.out.println("Move disk from " + from + " to " + to);
            Hanoi(n - 1, via, from, to);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter number of rows: ");
        x = sc.nextInt();
        System.out.println("Instructions to solve Tower of Hanoi for " + x + " are:");
        Hanoi(x, 'A', 'B', 'C');
    }
}