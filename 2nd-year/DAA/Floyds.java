import java.util.Scanner;

public class Floyds {
    static int[][] dist;
    static int n;

    static void floyds() {
        int i, j, k;
        for (k = 1; k <= n; k++) {
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }

            System.out.println("The distance matrix after " + k + " iteration is: ");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    System.out.print(dist[i][j] + " ");
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

        dist = new int[n + 1][n + 1];

        System.out.println("Enter the distance matrix: ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                dist[i][j] = sc.nextInt();
            }
        }

        floyds();
    }
}
