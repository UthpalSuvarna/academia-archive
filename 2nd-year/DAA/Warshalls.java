import java.util.Scanner;

public class Warshalls {
    static int[][] wt;
    static int n;

    static void warshalls() {
        int i, j, k;
        for (k = 1; k <= n; k++) {
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    wt[i][j] = wt[i][j] | (wt[i][k] & wt[k][j]);
                }
            }
            System.out.println("The matrix after " + k + " iteration is: ");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    System.out.print(wt[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        n = sc.nextInt();

        wt = new int[n + 1][n + 1];

        System.out.println("Enter the weight matrix: ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                wt[i][j] = sc.nextInt();
            }
        }

        warshalls();
    }
}
