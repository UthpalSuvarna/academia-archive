import java.util.Scanner;

public class BinarySearch {
    int search(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch ob = new BinarySearch();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in sorted order: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();
        int result = ob.search(arr, x);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
        sc.close();
    }
}