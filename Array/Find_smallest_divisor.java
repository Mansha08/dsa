public class Find_smallest_divisor {
    public static int sumByD(int nums[], int div) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) (nums[i]) / (double) (div));
        }
        return sum;
    }

    public static int smallestdivision(int[] nums, int threshold) {
        int n = nums.length;
        if (n > threshold)
            return -1;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int low = 1, high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;

            }
        }
        return low;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        int threshold = 8;
        int ans = smallestdivision(nums, threshold);
        System.out.println(ans);

    }
}
