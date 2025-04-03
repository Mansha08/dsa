import java.util.*;
public class remove_duplicates {
    
public static int remove(int arr[]){
    int  i =0;
    Arrays.sort(arr);
    for(int j = 1;j<arr.length;j++){
        if(arr[i] != arr[j]){
            i++;
            arr[i] = arr[j];
        }

    }
    return i+1;

}

    public static void main(String[] args) {
        //  int arr[] = {1,1,4,5,5,4,2,2,2,3,3};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int k = remove(arr);
        for(int i =0;i<k;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
