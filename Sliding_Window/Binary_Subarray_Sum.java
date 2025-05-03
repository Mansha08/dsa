package Sliding_Window;

public class Binary_Subarray_Sum {
    public static int Sum(int[] nums, int goal) {
        return totalSumLessThanGoal(nums, goal) - totalSumLessThanGoal(nums, goal - 1);
    }

    public static int totalSumLessThanGoal(int[] nums, int goal) {
        if (goal < 0)
            return 0;
        int l = 0, r = 0, sum = 0, count = 0;

        while (r < nums.length) {
            sum += nums[r];

            while (sum > goal) {
                sum = sum - nums[l];
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1 };
        int goal = 2;
        System.out.println(Sum(nums, goal));

    }

}
