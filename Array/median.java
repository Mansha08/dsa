import java.util.*;
public class median {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int n = arr.length;
        Arrays.sort(arr);
        int n1 = (n/2);
        int n2 = (n/2)-1;
        if(n%2 == 0){
           System.out.println((arr[n2] + arr[n1])/2);
        }else{
            System.out.println((arr[n1]));
        }


    }
    
}
