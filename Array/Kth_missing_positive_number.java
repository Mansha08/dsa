public class Kth_missing_positive_number {
    public static int kth(int arr[], int k) {
        int n = arr.length;
        // for(int i =0;i<n;i++){
        // if(arr[i] <= k){
        // k++;
        // }else
        // break;

        // }

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return k + high + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 9, 10 };
        int k = 4;
        int ans = kth(arr, k);
        System.out.println(ans);

    }

}
