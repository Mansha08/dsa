import java.util.Arrays;

public class repeating {
    public static void repeating_elem(int arr[], int n){
        Arrays.sort(arr);
        for(int i  =0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                System.out.println(arr[i] + "");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,4,6};
        int n = arr.length;
        repeating_elem(arr, n);
        

    }
    
}
