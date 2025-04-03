import java.util.Scanner;

public class Maximum_consecutive_ones {
    public static int maximum(int nums[]){
        int max =0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max,count);
            }else{
                count= 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int  i =0;i<n;i++){
        nums[i] = sc.nextInt();
        }
        System.out.println();

        int ans = maximum(nums);
        System.out.println(ans);
        
    }

    
}
