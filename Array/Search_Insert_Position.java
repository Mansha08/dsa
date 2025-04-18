public class Search_Insert_Position {
   public static int searchInsert(int []nums, int target){
    int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (right + left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return left;
   }
    public static void main(String[] args) {
        int nums[] = {1,3,4,5};
        int target = 2;
        int search = searchInsert(nums, target);
        System.out.println(search);
    
        
    }
}
