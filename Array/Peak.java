public class Peak {
    public static int peakelement(int nums[], int n){
        for(int i =0;i<n;i++){
            if((i == 0 || nums[i-1] < nums[i]) && (i == n-1 || nums[i] > nums[i+1])){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1,2,3,4,5,6,7,8,5,1};
        int n1 = 5;
        int arr2[] = {5,4,3,2,1};
        System.out.println(peakelement(arr, n));
        System.out.println(peakelement(arr2, n));

        
    }
    
}
