package Sliding_Window;

import java.util.HashMap;

public class Subarray_K_Different_Integers {

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
     private static int atMostK(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],0);
        int l=0;
        int r=0;
        int ans=0;
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            ans+=(r-l+1);
            r++;   
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};
        int k =3;
        System.out.println(subarraysWithKDistinct(nums, k));
        
    }
    
}
