import java.util.*;

public class Prims {
    static int[][] wt, edges;
    static int n, cost;

    static void prims() {
        int[] u, lowcost, visited;
        int min, i, j, v;
        int mincost = 0;
        u = new int[n + 1];
        visited = new int[n + 1];
        lowcost = new int[n + 1];
        edges = new int[n + 1][3];

        visited[1] = 1; // visit the firat node

        // Initialize lowcost u and visited
        for (i = 2; i <= n; i++) {
            visited[i] = 0;
            u[i] = 1;
            lowcost[i] = wt[1][i];
        }

        for (i = 1; i <= n - 1; i++) {

            // find v such that lowcost[v] is minimum from i
            min = lowcost[2];
            v = 2;
            for (j = 3; j <= n; j++) {
                if (lowcost[j] < min) {
                    min = lowcost[j];
                    v = j;
                }
            }

            edges[i][1] = u[v];// u[v] is the vertex from which v is reached
            edges[i][2] = v;// v is the vertex visited
            mincost += lowcost[v];// add to micost
            lowcost[v] = 99;// to prevent to visit agian
            visited[v] = 1;// mark v as visited

            for (j = 2; j <= n; j++) {
                // if there is shortedt path from v to j
                if (wt[v][j] < lowcost[j] && visited[j] == 0) {
                    lowcost[j] = wt[v][j];
                    u[j] = v;// if yes update: j is visited from v
                }
            }
        }

        System.out.println("Edges of minimum cost spanning tree are: ");
        for (i = 1; i <= n - 1; i++) {
            System.out.println(edges[i][1] + "->" + edges[i][2]);
        }
        System.out.println("Cost of minimum cost spanning tree is =" + mincost);
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

        prims();
    }
}