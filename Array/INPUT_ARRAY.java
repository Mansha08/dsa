import java.util.Scanner;
 public class INPUT_ARRAY {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//     }

public static int Smallest(int arr[]){
    int min = arr[0];
    for(int i =0;i<arr.length;i++){
        if(arr[i] <min){
            min = arr[i];
        }
    }
    return min;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

      //  print the array
        // for(int i =0;i<n;i++){
        //     System.out.println(arr[i] + " ");
        // }
        System.out.println( "Smallest element of the array");
        int answer = Smallest(arr);
        System.out.println(answer);
    }
}
