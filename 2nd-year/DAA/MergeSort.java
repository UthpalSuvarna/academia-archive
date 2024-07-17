import java.util.*;

public class MergeSort {
    private int[] a;

    void input() {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = rm.nextInt(100);
        sc.close();
    }

    void display() {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    void mergesort(int left, int right) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            mergesort(left, mid);
            mergesort(right, mid + 1);
            merge(left, mid, right);
        }
    }

    void merge(int left, int mid, int right) {
        int temp[] = new int[a.length];
        for (int i = left; i <= right; i++) {
            temp[i] = a[i];
        }
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                a[k++] = temp[i++];
            } else {
                a[k++] = temp[j++];
            }
        }
        while (i <= mid) {
            a[k++] = temp[i++];
        }
        while (j <= right) {
            a[k++] = temp[j++];
        }
    }

    void sort() {
        mergesort(0, a.length - 1);
    }

    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();
        sorter.input();
        System.out.println("Array before sorting ");
        sorter.display();
        long startTime = System.nanoTime();
        sorter.sort();
        long endTime = System.nanoTime();
        double duration = (endTime - startTime);
        System.out.println("\n Array after sorting is");
        sorter.display();
        System.out.println("Time take to sort is " + duration + " milliseconds");
    }
}
