import java.util.Arrays;

public class two_sum {
    public static String two(int n,int arr[],int target){
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int n = 5;
        int target = 14;
        String ans = two(n, arr, target);
        System.out.println(ans);
        
    }
    
}
