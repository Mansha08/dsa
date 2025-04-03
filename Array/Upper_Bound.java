public class Upper_Bound {
    public static int UpperBound(int nums[],int n, int x){
        int low =0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]>x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
            

        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,3};
        int n =4;
        int x =2;
        int upper = UpperBound(nums,n, x);
        System.out.println(upper);
        
    }
    
}
