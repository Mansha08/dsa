package Stack_Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Next_Greater_Element_S {
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num:nums2){
            while(!stack.isEmpty() && num>stack.peek()){
                int smallNum=stack.pop();
                nextGreaterMap.put(smallNum,num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty()){
            nextGreaterMap.put(stack.pop(),-1);
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=nextGreaterMap.get(nums1[i]);
        }
        return res; 
    }
    
}
