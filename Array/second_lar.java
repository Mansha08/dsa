import java.util.*;
public class second_lar {
    public static void lar(int arr[], int n){
        
        if(arr.length==0 ||arr.length ==1){
            System.out.println(-1);
        }
        Arrays.sort(arr);
        int small = arr[1];
        int lar = arr[n-2];
        System.out.println(small);
        System.out.println(lar);
    }
    public static void main(String[] args) {
        int arr[] = {};
        int n = arr.length;
        lar(arr, n);
        
    }
}
