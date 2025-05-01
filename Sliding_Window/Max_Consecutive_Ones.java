package Sliding_Window;

public class Max_Consecutive_Ones {
    public static int MAx(int[] nums, int k){
        int left = 0;
        int right =0;
        int zeros = 0;
        int len = 0;
        while(right <nums.length){
            if(nums[right] == 0){
                zeros++;
            }
            if(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            len = Math.max(len,right - left + 1);
            right++;
        }
        return len;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        System.err.println(MAx(nums, k));
    }
    
}
