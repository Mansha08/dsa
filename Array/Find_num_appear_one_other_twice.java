import java.util.Scanner;

public class Find_num_appear_one_other_twice {

    public static int appear(int []arr){
        int xoor = 0;
        for(int i =0;i<arr.length;i++){
            xoor = xoor^ arr[i];
        }
        return xoor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = appear(arr);
        System.out.println(ans);
    }
    
}
