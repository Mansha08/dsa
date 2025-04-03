import java.util.Scanner;

public class Move_zero_to_end {
    public static int[] move(int n, int []a){
        int j =-1;
        for(int i =0;i<n;i++){
            if(a[i] == 0){
                j =i;
                break;
            }
        
        }
        if(j == -1){
            return a;
        }
        for(int i = j+1;i<n;i++){
            if(a[i] != 0){
                int temp= a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
           a[i] = sc.nextInt();
        }

        int ans[] = move(n, a);
        for(int i=0;i<n;i++){
            System.out.println(ans[i] + " ");

        }
        System.out.println();
    
    }
}
