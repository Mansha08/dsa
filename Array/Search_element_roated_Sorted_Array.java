import java.util.Arrays;
public class Search_element_roated_Sorted_Array {
    public static boolean search(int arr[], int n, int k){
        // for(int i =0;i<n;i++){
        //     if(arr[i] == k){
        //         return true;
        //     }
        // }

        int left =0, right = n-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == k){
                return true;
            }
            if(arr[left] == arr[mid] && arr[mid] == arr[right]){
                left =left+1;
                right = right-1;
                continue;
            }
            if(arr[left] <= arr[mid]){
                if(arr[left] <= k && k <= arr[mid]){
               right = mid-1;

                }else{
                    left = mid+1;
                }
            }else{
                if(arr[mid]<=k && k<= arr[right]){
                    left = mid+1;

                }else{
                    right = mid -1;
                }
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {7,8,1,2,3,3,3,4,5,6};
          int k = 17;
         System.out.println(search(arr, n, k));
      
        
    }
    
}
