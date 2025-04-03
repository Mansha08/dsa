public class rotated_Arr_by_k {
    public static void safe(int arr[], int a, int b, int k){
        for(int i =0;i<k;i++){
            int temp = arr[a+i];
            arr[a+i] = arr[b+i];
            arr[b+i] = temp;
        }

    }
    public static void blockscope(int arr[], int i, int k, int n){
        if(k==0 || k==n)
            return;
        
        if(k== n-k){
        safe(arr, i, n-k+i, k);
        return;

        }
        else if(k<n-k){
            safe(arr, i, n-k+i, k);
            blockscope(arr, i, k, n-k);
        }
        else{
            safe(arr, i, k, n-k);
            blockscope(arr, n-k+i, 2*k-n, k);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n=arr.length;
        int k =2;
        blockscope(arr, 0, k, n);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
       
        
    }
    
}
