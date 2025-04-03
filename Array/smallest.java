import java.util.Arrays;

class smallest{
    static int sorto(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String args[]){
        int arr[] = {11,2,3,589,23};
        System.err.println(sorto(arr));
        
    }
}