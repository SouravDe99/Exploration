public class Ackermann_sequence {

    public static long A(long m, long n) {
        if (m == 0)
            return (n + 1);
        else if (n == 0)
            return A(m - 1, 1);
        else
            return A(m - 1, A(m, n - 1));
    }

    public static void main(String[] args) {
        long i, j;
        System.out.println("The Ackermann sequence is:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 20; j++) {
                System.out.println("A(" + i + "," + j + ") = " + A(i, j));
            }
        }
    }
}