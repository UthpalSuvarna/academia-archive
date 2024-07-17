import java.util.*;

public class SumOfSubsets {
    static int[] set, x;
    static int d, n, flag = 0;

    static void sumofsubsets(int s, int k) {
        int i;
        x[k] = 1;

        if (s + set[k] == d) {
            System.out.print("\n {");
            flag = 1;
            for (i = 1; i <= n; i++) {
                if (x[i] == 1) {
                    System.out.print(set[i] + " ");
                }
            }
            System.out.print("}");
        } else {
            // consider k
            if (s + set[k] < d && k + 1 < n) {
                sumofsubsets(s + set[k], k + 1);
                x[k + 1] = 0;
            }
            // dont consider k
            if (k + 1 <= n && s + set[k + 1] <= d) {
                x[k] = 0;
                sumofsubsets(s, k + 1);
                x[k + 1] = 0;
            }
        }

    }

    public static void main(String[] args) {
        int sum = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the set");
        n = sc.nextInt();
        set = new int[n + 1];
        x = new int[n + 1];
        System.out.println("Enter the set elements in incresing order");
        for (i = 1; i <= n; i++) {
            set[i] = sc.nextInt();
        }
        System.out.println("Enter the sum(d)");
        d = sc.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + set[i];
        }
        System.out.print("The sum of the set with sum=" + d);
        sumofsubsets(0, 1);
        if (sum < d || set[1] > d || flag == 0) {
            System.out.print("is not possible");
        }
        System.out.println();

    }
}
