import java.util.*;

public class Majority_element_second {
    public static List<Integer> majorityElement(int []nums){
        int n = nums.length;
        int cn1 = 0, cn2 =0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cn1 == 0 && el2 != nums[i]){
                cn1 = 1;
                el1 = nums[i];

            }else if(cn2 == 0 && el1 != nums[i]){
                cn2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1) cn1++;
            else if(nums[i] == el2) cn2++;
            else{
                cn1--;
                cn2--;
            }
        } 
        List<Integer> ls = new ArrayList<>();
        cn1 =0;
        cn2=0;
        for(int i =0;i<n;i++){
            if(nums[i] == el1) cn1++;
            if(nums[i] == el2) cn2++;
        }
        int mini = (int)(n/3) + 1;
        if(cn1 >= mini)
        ls.add(el1);
        if(cn2 >= mini)
        ls.add(el2);
        return ls;

    }
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    
    }
}
