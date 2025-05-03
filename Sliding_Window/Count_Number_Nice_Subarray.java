package Sliding_Window;

public class Count_Number_Nice_Subarray {

    public static int numberOfSubarrays(int[] nums, int k) {
        return number(nums, k) - number(nums, k - 1);
    }

    public static int number(int[] nums, int goal) {
        if (goal < 0)
            return 0;
        int l = 0, r = 0, sum = 0, count = 0;

        while (r < nums.length) {
            sum += nums[r] % 2;

            while (sum > goal) {
                sum = sum - nums[l] % 2;
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 1, 1 };
        int goal = 3;
        System.out.println(numberOfSubarrays(nums, goal));
    }
}
