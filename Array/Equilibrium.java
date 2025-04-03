import java.util.*;
public class Equilibrium {
    public static int equilibrium(int nums[], int n) {
        int totalsum = 0;
        for (int i = 0; i < n; i++) {
            totalsum += nums[i];

        }
        int left = 0, right = totalsum;
        for (int i = 0; i < n; i++) {
            right -= nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[]= new int[n];
       for(int i =0;i<n;i++)
{
    arr[i] = sc.nextInt();
}       int find = equilibrium(arr, n);
       System.out.println(find);

    }

}
