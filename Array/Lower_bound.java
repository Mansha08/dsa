public class Lower_bound {
    public static int lowerBound(int []arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 2, 4 };
        int n = 4;
        int target = 2;
      //  int ans = lower(nums, n, target);
      int ans = lowerBound(nums, n, target);
        System.out.println(ans);

    }

}
