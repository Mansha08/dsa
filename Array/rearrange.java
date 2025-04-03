import java.util.*;
public class rearrange {
    public static void rearrange(int arr[], int n){
        int st = 0;
        int end = n-1;
        Arrays.sort(arr);
        int mid = (st+end)/2;
        for(int i = st;i<=mid;i++){
            System.out.println(arr[i]);
        }
        for(int i = n-1;i>=mid+1;i--){
            System.err.println(arr[i]);
        }
    }
    

    public static void main(String[] args) {
        int arr[] = {8,7,1,6,5,9};
        int n = arr.length;
        rearrange(arr, n);
        
    }
    
}
