public class Search_element {
   
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,6,56,7};
        int n = arr.length;
        int k = 3;
        int ans = -1;
        int st =0;
        int end = n-1;
       
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid]>k){
                end = mid-1;
            }
            else if(arr[mid] <k){
                st = mid+1;
            }else{
                ans = mid;
                break;
            }
        }
        System.out.println(ans);
        
    }
    
}
