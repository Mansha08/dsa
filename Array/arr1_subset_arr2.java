import java.util.*;

public class arr1_subset_arr2 {

    public static boolean search(int num, int arr[], int n) {
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static boolean issubset(int arr1[], int m, int arr2[], int n) {
        if (m > n) {
            return false;

        }
        Arrays.sort(arr2);
        for (int i = 0; i < m; i++) {
            boolean present = search(arr1[i], arr2, n);
            if (present == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input for first array (potential subset)
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input for second array (potential superset)
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        boolean ans = issubset(arr1, n1, arr2, n2);
        if (ans == true) {
            System.err.println("arr1 is a subset of arr2");
        } else {
            System.err.println("Arr1 is not a subset of arr2");
        }

    }

}
