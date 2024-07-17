import java.util.*;

public class QuickSort {
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

    void sort() {
        quicksort(0, a.length - 1);
    }

    void quicksort(int left, int right) {
        if (left < right) {
            int s = partition(left, right);
            quicksort(left, s - 1);
            quicksort(s + 1, right);
        }
    }

    int partition(int left, int right) {
        int pivot = a[left];
        int i = left + 1;
        int j = right;
        while (i < j) {
            while (a[i] < pivot && i < right) {
                ++i;
            }
            while (a[j] > pivot) {
                --j;
            }
            if (i < j) {
                swap(i, j);
            }
        }
        swap(left, j);

        return j;
    }

    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        sorter.input();
        System.out.println("Array before sorting  ");
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
