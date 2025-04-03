import java.util.Scanner;

public class Min_roatated_sorted_array {
    public static int min(int n, int arr[]){
        int min = Integer.MAX_VALUE; 
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low] <= arr[mid]){
                min = Math.min(min, arr[low]);
                low = mid+1;
            }else{
                min = Math.min(min, arr[mid]);
                high = mid -1;
            }
        }
        return min;

        // for(int  i =0;i<n;i++){
        //     min = Math.min(min, arr[i]);
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = min(n, arr);
        System.out.println(ans);
        
    }
    
}
