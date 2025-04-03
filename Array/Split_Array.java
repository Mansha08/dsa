import java.util.ArrayList;

public class Split_Array {
    public static int splitArray(int nums[],int k){
        int low = nums[0];
        int high = 0;
        for(int i =0;i<nums.length;i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        while(low <= high){
            int mid = (low + high)/2;
            int partition = countPartition(nums, mid);
            if(partition > k){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return low;
    }
    public static int countPartition(int []nums, int maxsum){
        int partition = 1;
        int subarraySum = nums[0];
        for(int i =0;i<nums.length;i++){
            if(subarraySum +nums[i] <= maxsum){
subarraySum += nums[i];

            }else{
                partition++;
                subarraySum = nums[i];

            }
        }
        return partition;
    }
    public static void main(String[] args) {
        int nums[] = {10,20,30,40};
        int k =2;
        int ans = splitArray(nums, k);
        System.out.println(ans);
        
    }
    
}
