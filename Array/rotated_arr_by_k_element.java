public class rotated_arr_by_k_element {
    public static void reverse(int arr[], int start, int end){
        while (start<=end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    public static void rotate(int arr[], int n, int k){

        //rotate before one element at k
        reverse(arr, 0, k-1);
        //rotate k to last
        reverse(arr, k, n-1);
        //rotate whole
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 2;
        int n = arr.length;

        rotate(arr, n, k);
        System.out.println("after rotation");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    
}
