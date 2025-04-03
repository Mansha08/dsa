import java.util.Scanner;

public class Replace_All_zero_in_one{
    public static int replace(int num){
        if(num == 0){
            return 1;
        }
        int ans=0;
        int temp = 1;
        while(num>0){
            int d = num%10;
            if(d==0){
                d=1;
            }
                ans = d*temp +ans;
                num = num/10;
                temp = temp*10;

            
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = replace(num);
        System.out.println(result);
    }
    
}
