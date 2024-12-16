public class Co_Pattern {

    public static int gcd(int a, int b) {
        int r;
        if (b > a)
            a = a + b - (b = a);
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        int i, j, n = 25;
        String[][] grid = new String[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (gcd(i + 1, j + 1) == 1)
                    grid[i][j] = "*";
                else
                    grid[i][j] = " ";
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}