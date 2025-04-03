public class Longest_subarray_sum_positive {
    public static int longest(int []arr, long k){
        int left = 0, right =0;
        
        long  sum = arr[0];
        int maxl = 0;
        int n= arr.length;
        while(right < n){
            while(left <= right && sum >k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxl = Math.max(maxl, right - left + 1);
            }
            right++;
            if(right < n)
            sum += arr[right];
        }
        return maxl;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,3,3};
        long k =6;
        int ans = longest(arr,k);
        System.out.println(ans);
        
    }
    
}
