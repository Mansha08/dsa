public class sum_all {
    
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,1,5,1};
        int n = arr.length;
        int sum =0;
        for(int i =0;i<n;i++){
             sum += arr[i];
            
             System.out.println(sum);
        }
    }
    
}
