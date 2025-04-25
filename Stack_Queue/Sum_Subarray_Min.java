package Stack_Queue;

import java.util.Stack;

public class Sum_Subarray_Min {
    public static int[] findnse(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();   }
            res[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);    }
        return res;
    }
    public  static int[] findpse(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();   }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);    }
        return res;
    }
    public static int sumSubarrayMins(int[] arr) {
        long total = 0;
        final int MOD = 1000000007;
        int[] nextt = findnse(arr);
        int[] prevv = findpse(arr);
        for (int i = 0; i < arr.length; i++) {
            long left = i - prevv[i];
            long right = nextt[i] - i;
            total = (total + (left * right % MOD) * arr[i] % MOD) % MOD;
        }
        return (int) total;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
        
    }
    
}
