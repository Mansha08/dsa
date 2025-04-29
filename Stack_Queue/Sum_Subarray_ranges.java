package Stack_Queue;

import java.util.Stack;

class Sum_Subarray_ranges{

     public static long subArrayRanges(int[] nums) {
        int n = nums.length;
        int[] leftMin = new int[n];     int[] rightMin = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && nums[i]<nums[st.peek()]) st.pop();
            leftMin[i] = st.isEmpty()?(i+1):i-st.peek();
            st.push(i);     }
        st.clear();
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && nums[i] <= nums[st.peek()]) st.pop();
            rightMin[i] = st.isEmpty()?(n-i):st.peek()-i;
            st.push(i);  }
        long mins=0;     long mod = (long)1e9+7;
        for(int i=0;i<n;i++) {
            mins = (mins+(long)nums[i]*leftMin[i]*rightMin[i]) ;  }
        for(int i=0;i<n;i++) {
            leftMin[i] = 0;     rightMin[i] = 0;  }
        st.clear();
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && nums[i]>nums[st.peek()]) st.pop();
            leftMin[i] = st.isEmpty()?(i+1):i-st.peek();
            st.push(i); }
        st.clear();
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && nums[i]>=nums[st.peek()]) st.pop();
            rightMin[i] = st.isEmpty()?(n-i):st.peek()-i;
            st.push(i);   }
        long maxx = 0;
        for(int i=0;i<n;i++) {
            maxx = (maxx + (long)nums[i]*leftMin[i]*rightMin[i]) ;   }
        return maxx - mins;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
       long res = subArrayRanges(nums);
       System.out.println(res);
    }
}